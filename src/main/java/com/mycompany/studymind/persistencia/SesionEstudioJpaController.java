 
package com.mycompany.studymind.persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.studymind.logica.Estudiante;
import com.mycompany.studymind.logica.SesionEstudio;
import com.mycompany.studymind.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

 
public class SesionEstudioJpaController implements Serializable {

    public SesionEstudioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
     public SesionEstudioJpaController( ) {
        emf = Persistence.createEntityManagerFactory("StudyMindPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(SesionEstudio sesionEstudio) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Estudiante estudiante = sesionEstudio.getEstudiante();
            if (estudiante != null) {
                estudiante = em.getReference(estudiante.getClass(), estudiante.getId_Estudiante());
                sesionEstudio.setEstudiante(estudiante);
            }
            em.persist(sesionEstudio);
            if (estudiante != null) {
                estudiante.getSesionEstudio().add(sesionEstudio);
                estudiante = em.merge(estudiante);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(SesionEstudio sesionEstudio) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            SesionEstudio persistentSesionEstudio = em.find(SesionEstudio.class, sesionEstudio.getId_Sesion());
            Estudiante estudianteOld = persistentSesionEstudio.getEstudiante();
            Estudiante estudianteNew = sesionEstudio.getEstudiante();
            if (estudianteNew != null) {
                estudianteNew = em.getReference(estudianteNew.getClass(), estudianteNew.getId_Estudiante());
                sesionEstudio.setEstudiante(estudianteNew);
            }
            sesionEstudio = em.merge(sesionEstudio);
            if (estudianteOld != null && !estudianteOld.equals(estudianteNew)) {
                estudianteOld.getSesionEstudio().remove(sesionEstudio);
                estudianteOld = em.merge(estudianteOld);
            }
            if (estudianteNew != null && !estudianteNew.equals(estudianteOld)) {
                estudianteNew.getSesionEstudio().add(sesionEstudio);
                estudianteNew = em.merge(estudianteNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = sesionEstudio.getId_Sesion();
                if (findSesionEstudio(id) == null) {
                    throw new NonexistentEntityException("The sesionEstudio with id " + id + " no longer exists.");
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
            SesionEstudio sesionEstudio;
            try {
                sesionEstudio = em.getReference(SesionEstudio.class, id);
                sesionEstudio.getId_Sesion();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The sesionEstudio with id " + id + " no longer exists.", enfe);
            }
            Estudiante estudiante = sesionEstudio.getEstudiante();
            if (estudiante != null) {
                estudiante.getSesionEstudio().remove(sesionEstudio);
                estudiante = em.merge(estudiante);
            }
            em.remove(sesionEstudio);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<SesionEstudio> findSesionEstudioEntities() {
        return findSesionEstudioEntities(true, -1, -1);
    }

    public List<SesionEstudio> findSesionEstudioEntities(int maxResults, int firstResult) {
        return findSesionEstudioEntities(false, maxResults, firstResult);
    }

    private List<SesionEstudio> findSesionEstudioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(SesionEstudio.class));
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

    public SesionEstudio findSesionEstudio(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(SesionEstudio.class, id);
        } finally {
            em.close();
        }
    }

    public int getSesionEstudioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<SesionEstudio> rt = cq.from(SesionEstudio.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
