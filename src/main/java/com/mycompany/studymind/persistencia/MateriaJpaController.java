
package com.mycompany.studymind.persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.studymind.logica.Estudiante;
import com.mycompany.studymind.logica.Materia;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.studymind.logica.SesionEstudio;
import com.mycompany.studymind.persistencia.exceptions.NonexistentEntityException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MateriaJpaController implements Serializable {

    public MateriaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
     public MateriaJpaController( ) {
        emf = Persistence.createEntityManagerFactory("StudyMindPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Materia materia) {
        if (materia.getEstudiantes() == null) {
            materia.setEstudiantes(new ArrayList<Estudiante>());
        }
        if (materia.getSesionesEstudio() == null) {
            materia.setSesionesEstudio(new ArrayList<SesionEstudio>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Estudiante> attachedEstudiantes = new ArrayList<Estudiante>();
            for (Estudiante estudiantesEstudianteToAttach : materia.getEstudiantes()) {
                estudiantesEstudianteToAttach = em.getReference(estudiantesEstudianteToAttach.getClass(), estudiantesEstudianteToAttach.getId_Estudiante());
                attachedEstudiantes.add(estudiantesEstudianteToAttach);
            }
            materia.setEstudiantes(attachedEstudiantes);
            List<SesionEstudio> attachedSesionesEstudio = new ArrayList<SesionEstudio>();
            for (SesionEstudio sesionesEstudioSesionEstudioToAttach : materia.getSesionesEstudio()) {
                sesionesEstudioSesionEstudioToAttach = em.getReference(sesionesEstudioSesionEstudioToAttach.getClass(), sesionesEstudioSesionEstudioToAttach.getId_Sesion());
                attachedSesionesEstudio.add(sesionesEstudioSesionEstudioToAttach);
            }
            materia.setSesionesEstudio(attachedSesionesEstudio);
            em.persist(materia);
            for (Estudiante estudiantesEstudiante : materia.getEstudiantes()) {
                estudiantesEstudiante.getMaterias().add(materia);
                estudiantesEstudiante = em.merge(estudiantesEstudiante);
            }
            for (SesionEstudio sesionesEstudioSesionEstudio : materia.getSesionesEstudio()) {
                Materia oldMateriaOfSesionesEstudioSesionEstudio = sesionesEstudioSesionEstudio.getMateria();
                sesionesEstudioSesionEstudio.setMateria(materia);
                sesionesEstudioSesionEstudio = em.merge(sesionesEstudioSesionEstudio);
                if (oldMateriaOfSesionesEstudioSesionEstudio != null) {
                    oldMateriaOfSesionesEstudioSesionEstudio.getSesionesEstudio().remove(sesionesEstudioSesionEstudio);
                    oldMateriaOfSesionesEstudioSesionEstudio = em.merge(oldMateriaOfSesionesEstudioSesionEstudio);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Materia materia) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Materia persistentMateria = em.find(Materia.class, materia.getId_Materia());
            List<Estudiante> estudiantesOld = persistentMateria.getEstudiantes();
            List<Estudiante> estudiantesNew = materia.getEstudiantes();
            List<SesionEstudio> sesionesEstudioOld = persistentMateria.getSesionesEstudio();
            List<SesionEstudio> sesionesEstudioNew = materia.getSesionesEstudio();
            List<Estudiante> attachedEstudiantesNew = new ArrayList<Estudiante>();
            for (Estudiante estudiantesNewEstudianteToAttach : estudiantesNew) {
                estudiantesNewEstudianteToAttach = em.getReference(estudiantesNewEstudianteToAttach.getClass(), estudiantesNewEstudianteToAttach.getId_Estudiante());
                attachedEstudiantesNew.add(estudiantesNewEstudianteToAttach);
            }
            estudiantesNew = attachedEstudiantesNew;
            materia.setEstudiantes(estudiantesNew);
            List<SesionEstudio> attachedSesionesEstudioNew = new ArrayList<SesionEstudio>();
            for (SesionEstudio sesionesEstudioNewSesionEstudioToAttach : sesionesEstudioNew) {
                sesionesEstudioNewSesionEstudioToAttach = em.getReference(sesionesEstudioNewSesionEstudioToAttach.getClass(), sesionesEstudioNewSesionEstudioToAttach.getId_Sesion());
                attachedSesionesEstudioNew.add(sesionesEstudioNewSesionEstudioToAttach);
            }
            sesionesEstudioNew = attachedSesionesEstudioNew;
            materia.setSesionesEstudio(sesionesEstudioNew);
            materia = em.merge(materia);
            for (Estudiante estudiantesOldEstudiante : estudiantesOld) {
                if (!estudiantesNew.contains(estudiantesOldEstudiante)) {
                    estudiantesOldEstudiante.getMaterias().remove(materia);
                    estudiantesOldEstudiante = em.merge(estudiantesOldEstudiante);
                }
            }
            for (Estudiante estudiantesNewEstudiante : estudiantesNew) {
                if (!estudiantesOld.contains(estudiantesNewEstudiante)) {
                    estudiantesNewEstudiante.getMaterias().add(materia);
                    estudiantesNewEstudiante = em.merge(estudiantesNewEstudiante);
                }
            }
            for (SesionEstudio sesionesEstudioOldSesionEstudio : sesionesEstudioOld) {
                if (!sesionesEstudioNew.contains(sesionesEstudioOldSesionEstudio)) {
                    sesionesEstudioOldSesionEstudio.setMateria(null);
                    sesionesEstudioOldSesionEstudio = em.merge(sesionesEstudioOldSesionEstudio);
                }
            }
            for (SesionEstudio sesionesEstudioNewSesionEstudio : sesionesEstudioNew) {
                if (!sesionesEstudioOld.contains(sesionesEstudioNewSesionEstudio)) {
                    Materia oldMateriaOfSesionesEstudioNewSesionEstudio = sesionesEstudioNewSesionEstudio.getMateria();
                    sesionesEstudioNewSesionEstudio.setMateria(materia);
                    sesionesEstudioNewSesionEstudio = em.merge(sesionesEstudioNewSesionEstudio);
                    if (oldMateriaOfSesionesEstudioNewSesionEstudio != null && !oldMateriaOfSesionesEstudioNewSesionEstudio.equals(materia)) {
                        oldMateriaOfSesionesEstudioNewSesionEstudio.getSesionesEstudio().remove(sesionesEstudioNewSesionEstudio);
                        oldMateriaOfSesionesEstudioNewSesionEstudio = em.merge(oldMateriaOfSesionesEstudioNewSesionEstudio);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = materia.getId_Materia();
                if (findMateria(id) == null) {
                    throw new NonexistentEntityException("The materia with id " + id + " no longer exists.");
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
            Materia materia;
            try {
                materia = em.getReference(Materia.class, id);
                materia.getId_Materia();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The materia with id " + id + " no longer exists.", enfe);
            }
            List<Estudiante> estudiantes = materia.getEstudiantes();
            for (Estudiante estudiantesEstudiante : estudiantes) {
                estudiantesEstudiante.getMaterias().remove(materia);
                estudiantesEstudiante = em.merge(estudiantesEstudiante);
            }
            List<SesionEstudio> sesionesEstudio = materia.getSesionesEstudio();
            for (SesionEstudio sesionesEstudioSesionEstudio : sesionesEstudio) {
                sesionesEstudioSesionEstudio.setMateria(null);
                sesionesEstudioSesionEstudio = em.merge(sesionesEstudioSesionEstudio);
            }
            em.remove(materia);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Materia> findMateriaEntities() {
        return findMateriaEntities(true, -1, -1);
    }

    public List<Materia> findMateriaEntities(int maxResults, int firstResult) {
        return findMateriaEntities(false, maxResults, firstResult);
    }

    private List<Materia> findMateriaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Materia.class));
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

    public Materia findMateria(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Materia.class, id);
        } finally {
            em.close();
        }
    }

    public int getMateriaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Materia> rt = cq.from(Materia.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
