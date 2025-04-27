package com.mycompany.studymind.persistencia;

import com.mycompany.studymind.logica.Juegos;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.studymind.logica.SesionEstudio;
import com.mycompany.studymind.logica.LinkJuego;
import com.mycompany.studymind.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JuegosJpaController implements Serializable {

    public JuegosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public JuegosJpaController( ) {
        emf = Persistence.createEntityManagerFactory("StudyMindPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Juegos juegos) {
        if (juegos.getLinks() == null) {
            juegos.setLinks(new ArrayList<LinkJuego>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            SesionEstudio sesionestudio = juegos.getSesionestudio();
            if (sesionestudio != null) {
                sesionestudio = em.getReference(sesionestudio.getClass(), sesionestudio.getId_Sesion());
                juegos.setSesionestudio(sesionestudio);
            }
            List<LinkJuego> attachedLinks = new ArrayList<LinkJuego>();
            for (LinkJuego linksLinkJuegoToAttach : juegos.getLinks()) {
                linksLinkJuegoToAttach = em.getReference(linksLinkJuegoToAttach.getClass(), linksLinkJuegoToAttach.getId_Link());
                attachedLinks.add(linksLinkJuegoToAttach);
            }
            juegos.setLinks(attachedLinks);
            em.persist(juegos);
            if (sesionestudio != null) {
                sesionestudio.getJuegos().add(juegos);
                sesionestudio = em.merge(sesionestudio);
            }
            for (LinkJuego linksLinkJuego : juegos.getLinks()) {
                Juegos oldJuegoOfLinksLinkJuego = linksLinkJuego.getJuego();
                linksLinkJuego.setJuego(juegos);
                linksLinkJuego = em.merge(linksLinkJuego);
                if (oldJuegoOfLinksLinkJuego != null) {
                    oldJuegoOfLinksLinkJuego.getLinks().remove(linksLinkJuego);
                    oldJuegoOfLinksLinkJuego = em.merge(oldJuegoOfLinksLinkJuego);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Juegos juegos) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Juegos persistentJuegos = em.find(Juegos.class, juegos.getId_Juegos());
            SesionEstudio sesionestudioOld = persistentJuegos.getSesionestudio();
            SesionEstudio sesionestudioNew = juegos.getSesionestudio();
            List<LinkJuego> linksOld = persistentJuegos.getLinks();
            List<LinkJuego> linksNew = juegos.getLinks();
            if (sesionestudioNew != null) {
                sesionestudioNew = em.getReference(sesionestudioNew.getClass(), sesionestudioNew.getId_Sesion());
                juegos.setSesionestudio(sesionestudioNew);
            }
            List<LinkJuego> attachedLinksNew = new ArrayList<LinkJuego>();
            for (LinkJuego linksNewLinkJuegoToAttach : linksNew) {
                linksNewLinkJuegoToAttach = em.getReference(linksNewLinkJuegoToAttach.getClass(), linksNewLinkJuegoToAttach.getId_Link());
                attachedLinksNew.add(linksNewLinkJuegoToAttach);
            }
            linksNew = attachedLinksNew;
            juegos.setLinks(linksNew);
            juegos = em.merge(juegos);
            if (sesionestudioOld != null && !sesionestudioOld.equals(sesionestudioNew)) {
                sesionestudioOld.getJuegos().remove(juegos);
                sesionestudioOld = em.merge(sesionestudioOld);
            }
            if (sesionestudioNew != null && !sesionestudioNew.equals(sesionestudioOld)) {
                sesionestudioNew.getJuegos().add(juegos);
                sesionestudioNew = em.merge(sesionestudioNew);
            }
            for (LinkJuego linksOldLinkJuego : linksOld) {
                if (!linksNew.contains(linksOldLinkJuego)) {
                    linksOldLinkJuego.setJuego(null);
                    linksOldLinkJuego = em.merge(linksOldLinkJuego);
                }
            }
            for (LinkJuego linksNewLinkJuego : linksNew) {
                if (!linksOld.contains(linksNewLinkJuego)) {
                    Juegos oldJuegoOfLinksNewLinkJuego = linksNewLinkJuego.getJuego();
                    linksNewLinkJuego.setJuego(juegos);
                    linksNewLinkJuego = em.merge(linksNewLinkJuego);
                    if (oldJuegoOfLinksNewLinkJuego != null && !oldJuegoOfLinksNewLinkJuego.equals(juegos)) {
                        oldJuegoOfLinksNewLinkJuego.getLinks().remove(linksNewLinkJuego);
                        oldJuegoOfLinksNewLinkJuego = em.merge(oldJuegoOfLinksNewLinkJuego);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = juegos.getId_Juegos();
                if (findJuegos(id) == null) {
                    throw new NonexistentEntityException("The juegos with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Juegos juegos;
            try {
                juegos = em.getReference(Juegos.class, id);
                juegos.getId_Juegos();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The juegos with id " + id + " no longer exists.", enfe);
            }
            SesionEstudio sesionestudio = juegos.getSesionestudio();
            if (sesionestudio != null) {
                sesionestudio.getJuegos().remove(juegos);
                sesionestudio = em.merge(sesionestudio);
            }
            List<LinkJuego> links = juegos.getLinks();
            for (LinkJuego linksLinkJuego : links) {
                linksLinkJuego.setJuego(null);
                linksLinkJuego = em.merge(linksLinkJuego);
            }
            em.remove(juegos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Juegos> findJuegosEntities() {
        return findJuegosEntities(true, -1, -1);
    }

    public List<Juegos> findJuegosEntities(int maxResults, int firstResult) {
        return findJuegosEntities(false, maxResults, firstResult);
    }

    private List<Juegos> findJuegosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Juegos.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Juegos findJuegos(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Juegos.class, id);
        } finally {
            em.close();
        }
    }

    public int getJuegosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Juegos> rt = cq.from(Juegos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
