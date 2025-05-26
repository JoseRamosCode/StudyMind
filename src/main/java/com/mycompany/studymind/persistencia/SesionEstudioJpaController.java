
package com.mycompany.studymind.persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.studymind.logica.Estudiante;
import com.mycompany.studymind.logica.Materia_backup;
import com.mycompany.studymind.logica.Juegos;
import com.mycompany.studymind.logica.SesionEstudio;
import com.mycompany.studymind.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
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
        if (sesionEstudio.getJuegos() == null) {
            sesionEstudio.setJuegos(new ArrayList<Juegos>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Estudiante estudiante = sesionEstudio.getEstudiante();
            if (estudiante != null) {
                estudiante = em.getReference(estudiante.getClass(), estudiante.getId_Estudiante());
                sesionEstudio.setEstudiante(estudiante);
            }
            Materia_backup materia = sesionEstudio.getMateria();
            if (materia != null) {
                materia = em.getReference(materia.getClass(), materia.getId_Materia());
                sesionEstudio.setMateria(materia);
            }
            List<Juegos> attachedJuegos = new ArrayList<Juegos>();
            for (Juegos juegosJuegosToAttach : sesionEstudio.getJuegos()) {
                juegosJuegosToAttach = em.getReference(juegosJuegosToAttach.getClass(), juegosJuegosToAttach.getId_Juegos());
                attachedJuegos.add(juegosJuegosToAttach);
            }
            sesionEstudio.setJuegos(attachedJuegos);
            em.persist(sesionEstudio);
            if (estudiante != null) {
                estudiante.getSesionEstudio().add(sesionEstudio);
                estudiante = em.merge(estudiante);
            }
            if (materia != null) {
                materia.getSesionesEstudio().add(sesionEstudio);
                materia = em.merge(materia);
            }
            for (Juegos juegosJuegos : sesionEstudio.getJuegos()) {
                SesionEstudio oldSesionEstudioOfJuegosJuegos = juegosJuegos.getSesionEstudio();
                juegosJuegos.setSesionEstudio(sesionEstudio);
                juegosJuegos = em.merge(juegosJuegos);
                if (oldSesionEstudioOfJuegosJuegos != null) {
                    oldSesionEstudioOfJuegosJuegos.getJuegos().remove(juegosJuegos);
                    oldSesionEstudioOfJuegosJuegos = em.merge(oldSesionEstudioOfJuegosJuegos);
                }
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
            Materia_backup materiaOld = persistentSesionEstudio.getMateria();
            Materia_backup materiaNew = sesionEstudio.getMateria();
            List<Juegos> juegosOld = persistentSesionEstudio.getJuegos();
            List<Juegos> juegosNew = sesionEstudio.getJuegos();
            if (estudianteNew != null) {
                estudianteNew = em.getReference(estudianteNew.getClass(), estudianteNew.getId_Estudiante());
                sesionEstudio.setEstudiante(estudianteNew);
            }
            if (materiaNew != null) {
                materiaNew = em.getReference(materiaNew.getClass(), materiaNew.getId_Materia());
                sesionEstudio.setMateria(materiaNew);
            }
            List<Juegos> attachedJuegosNew = new ArrayList<Juegos>();
            for (Juegos juegosNewJuegosToAttach : juegosNew) {
                juegosNewJuegosToAttach = em.getReference(juegosNewJuegosToAttach.getClass(), juegosNewJuegosToAttach.getId_Juegos());
                attachedJuegosNew.add(juegosNewJuegosToAttach);
            }
            juegosNew = attachedJuegosNew;
            sesionEstudio.setJuegos(juegosNew);
            sesionEstudio = em.merge(sesionEstudio);
            if (estudianteOld != null && !estudianteOld.equals(estudianteNew)) {
                estudianteOld.getSesionEstudio().remove(sesionEstudio);
                estudianteOld = em.merge(estudianteOld);
            }
            if (estudianteNew != null && !estudianteNew.equals(estudianteOld)) {
                estudianteNew.getSesionEstudio().add(sesionEstudio);
                estudianteNew = em.merge(estudianteNew);
            }
            if (materiaOld != null && !materiaOld.equals(materiaNew)) {
                materiaOld.getSesionesEstudio().remove(sesionEstudio);
                materiaOld = em.merge(materiaOld);
            }
            if (materiaNew != null && !materiaNew.equals(materiaOld)) {
                materiaNew.getSesionesEstudio().add(sesionEstudio);
                materiaNew = em.merge(materiaNew);
            }
            for (Juegos juegosOldJuegos : juegosOld) {
                if (!juegosNew.contains(juegosOldJuegos)) {
                    juegosOldJuegos.setSesionEstudio(null);
                    juegosOldJuegos = em.merge(juegosOldJuegos);
                }
            }
            for (Juegos juegosNewJuegos : juegosNew) {
                if (!juegosOld.contains(juegosNewJuegos)) {
                    SesionEstudio oldSesionEstudioOfJuegosNewJuegos = juegosNewJuegos.getSesionEstudio();
                    juegosNewJuegos.setSesionEstudio(sesionEstudio);
                    juegosNewJuegos = em.merge(juegosNewJuegos);
                    if (oldSesionEstudioOfJuegosNewJuegos != null && !oldSesionEstudioOfJuegosNewJuegos.equals(sesionEstudio)) {
                        oldSesionEstudioOfJuegosNewJuegos.getJuegos().remove(juegosNewJuegos);
                        oldSesionEstudioOfJuegosNewJuegos = em.merge(oldSesionEstudioOfJuegosNewJuegos);
                    }
                }
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
            Materia_backup materia = sesionEstudio.getMateria();
            if (materia != null) {
                materia.getSesionesEstudio().remove(sesionEstudio);
                materia = em.merge(materia);
            }
            List<Juegos> juegos = sesionEstudio.getJuegos();
            for (Juegos juegosJuegos : juegos) {
                juegosJuegos.setSesionEstudio(null);
                juegosJuegos = em.merge(juegosJuegos);
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
