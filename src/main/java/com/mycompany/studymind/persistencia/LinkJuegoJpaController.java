
package com.mycompany.studymind.persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.studymind.logica.Juegos;
import com.mycompany.studymind.logica.LinkJuego;
import com.mycompany.studymind.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class LinkJuegoJpaController implements Serializable {

    public LinkJuegoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
     public LinkJuegoJpaController( ) {
        emf = Persistence.createEntityManagerFactory("StudyMindPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(LinkJuego linkJuego) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Juegos juego = linkJuego.getJuego();
            if (juego != null) {
                juego = em.getReference(juego.getClass(), juego.getId_Juegos());
                linkJuego.setJuego(juego);
            }
            em.persist(linkJuego);
            if (juego != null) {
                juego.getLinks().add(linkJuego);
                juego = em.merge(juego);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(LinkJuego linkJuego) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            LinkJuego persistentLinkJuego = em.find(LinkJuego.class, linkJuego.getId_Link());
            Juegos juegoOld = persistentLinkJuego.getJuego();
            Juegos juegoNew = linkJuego.getJuego();
            if (juegoNew != null) {
                juegoNew = em.getReference(juegoNew.getClass(), juegoNew.getId_Juegos());
                linkJuego.setJuego(juegoNew);
            }
            linkJuego = em.merge(linkJuego);
            if (juegoOld != null && !juegoOld.equals(juegoNew)) {
                juegoOld.getLinks().remove(linkJuego);
                juegoOld = em.merge(juegoOld);
            }
            if (juegoNew != null && !juegoNew.equals(juegoOld)) {
                juegoNew.getLinks().add(linkJuego);
                juegoNew = em.merge(juegoNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = linkJuego.getId_Link();
                if (findLinkJuego(id) == null) {
                    throw new NonexistentEntityException("The linkJuego with id " + id + " no longer exists.");
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
            LinkJuego linkJuego;
            try {
                linkJuego = em.getReference(LinkJuego.class, id);
                linkJuego.getId_Link();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The linkJuego with id " + id + " no longer exists.", enfe);
            }
            Juegos juego = linkJuego.getJuego();
            if (juego != null) {
                juego.getLinks().remove(linkJuego);
                juego = em.merge(juego);
            }
            em.remove(linkJuego);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<LinkJuego> findLinkJuegoEntities() {
        return findLinkJuegoEntities(true, -1, -1);
    }

    public List<LinkJuego> findLinkJuegoEntities(int maxResults, int firstResult) {
        return findLinkJuegoEntities(false, maxResults, firstResult);
    }

    private List<LinkJuego> findLinkJuegoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(LinkJuego.class));
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

    public LinkJuego findLinkJuego(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(LinkJuego.class, id);
        } finally {
            em.close();
        }
    }

    public int getLinkJuegoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<LinkJuego> rt = cq.from(LinkJuego.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
