
package com.mycompany.studymind.persistencia;
import com.mycompany.studymind.logica.Estudiante;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.studymind.logica.SesionEstudio;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.studymind.logica.Materia;
import com.mycompany.studymind.persistencia.exceptions.NonexistentEntityException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EstudianteJpaController implements Serializable {

    public EstudianteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
     public EstudianteJpaController( ) {
        emf = Persistence.createEntityManagerFactory("StudyMindPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Estudiante estudiante) {
        if (estudiante.getSesionEstudio() == null) {
            estudiante.setSesionEstudio(new ArrayList<SesionEstudio>());
        }
        if (estudiante.getMaterias() == null) {
            estudiante.setMaterias(new ArrayList<Materia>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<SesionEstudio> attachedSesionEstudio = new ArrayList<SesionEstudio>();
            for (SesionEstudio sesionEstudioSesionEstudioToAttach : estudiante.getSesionEstudio()) {
                sesionEstudioSesionEstudioToAttach = em.getReference(sesionEstudioSesionEstudioToAttach.getClass(), sesionEstudioSesionEstudioToAttach.getId_Sesion());
                attachedSesionEstudio.add(sesionEstudioSesionEstudioToAttach);
            }
            estudiante.setSesionEstudio(attachedSesionEstudio);
            List<Materia> attachedMaterias = new ArrayList<Materia>();
            for (Materia materiasMateriaToAttach : estudiante.getMaterias()) {
                materiasMateriaToAttach = em.getReference(materiasMateriaToAttach.getClass(), materiasMateriaToAttach.getId_Materia());
                attachedMaterias.add(materiasMateriaToAttach);
            }
            estudiante.setMaterias(attachedMaterias);
            em.persist(estudiante);
            for (SesionEstudio sesionEstudioSesionEstudio : estudiante.getSesionEstudio()) {
                Estudiante oldEstudianteOfSesionEstudioSesionEstudio = sesionEstudioSesionEstudio.getEstudiante();
                sesionEstudioSesionEstudio.setEstudiante(estudiante);
                sesionEstudioSesionEstudio = em.merge(sesionEstudioSesionEstudio);
                if (oldEstudianteOfSesionEstudioSesionEstudio != null) {
                    oldEstudianteOfSesionEstudioSesionEstudio.getSesionEstudio().remove(sesionEstudioSesionEstudio);
                    oldEstudianteOfSesionEstudioSesionEstudio = em.merge(oldEstudianteOfSesionEstudioSesionEstudio);
                }
            }
            for (Materia materiasMateria : estudiante.getMaterias()) {
                materiasMateria.getEstudiantes().add(estudiante);
                materiasMateria = em.merge(materiasMateria);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Estudiante estudiante) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Estudiante persistentEstudiante = em.find(Estudiante.class, estudiante.getId_Estudiante());
            List<SesionEstudio> sesionEstudioOld = persistentEstudiante.getSesionEstudio();
            List<SesionEstudio> sesionEstudioNew = estudiante.getSesionEstudio();
            List<Materia> materiasOld = persistentEstudiante.getMaterias();
            List<Materia> materiasNew = estudiante.getMaterias();
            List<SesionEstudio> attachedSesionEstudioNew = new ArrayList<SesionEstudio>();
            for (SesionEstudio sesionEstudioNewSesionEstudioToAttach : sesionEstudioNew) {
                sesionEstudioNewSesionEstudioToAttach = em.getReference(sesionEstudioNewSesionEstudioToAttach.getClass(), sesionEstudioNewSesionEstudioToAttach.getId_Sesion());
                attachedSesionEstudioNew.add(sesionEstudioNewSesionEstudioToAttach);
            }
            sesionEstudioNew = attachedSesionEstudioNew;
            estudiante.setSesionEstudio(sesionEstudioNew);
            List<Materia> attachedMateriasNew = new ArrayList<Materia>();
            for (Materia materiasNewMateriaToAttach : materiasNew) {
                materiasNewMateriaToAttach = em.getReference(materiasNewMateriaToAttach.getClass(), materiasNewMateriaToAttach.getId_Materia());
                attachedMateriasNew.add(materiasNewMateriaToAttach);
            }
            materiasNew = attachedMateriasNew;
            estudiante.setMaterias(materiasNew);
            estudiante = em.merge(estudiante);
            for (SesionEstudio sesionEstudioOldSesionEstudio : sesionEstudioOld) {
                if (!sesionEstudioNew.contains(sesionEstudioOldSesionEstudio)) {
                    sesionEstudioOldSesionEstudio.setEstudiante(null);
                    sesionEstudioOldSesionEstudio = em.merge(sesionEstudioOldSesionEstudio);
                }
            }
            for (SesionEstudio sesionEstudioNewSesionEstudio : sesionEstudioNew) {
                if (!sesionEstudioOld.contains(sesionEstudioNewSesionEstudio)) {
                    Estudiante oldEstudianteOfSesionEstudioNewSesionEstudio = sesionEstudioNewSesionEstudio.getEstudiante();
                    sesionEstudioNewSesionEstudio.setEstudiante(estudiante);
                    sesionEstudioNewSesionEstudio = em.merge(sesionEstudioNewSesionEstudio);
                    if (oldEstudianteOfSesionEstudioNewSesionEstudio != null && !oldEstudianteOfSesionEstudioNewSesionEstudio.equals(estudiante)) {
                        oldEstudianteOfSesionEstudioNewSesionEstudio.getSesionEstudio().remove(sesionEstudioNewSesionEstudio);
                        oldEstudianteOfSesionEstudioNewSesionEstudio = em.merge(oldEstudianteOfSesionEstudioNewSesionEstudio);
                    }
                }
            }
            for (Materia materiasOldMateria : materiasOld) {
                if (!materiasNew.contains(materiasOldMateria)) {
                    materiasOldMateria.getEstudiantes().remove(estudiante);
                    materiasOldMateria = em.merge(materiasOldMateria);
                }
            }
            for (Materia materiasNewMateria : materiasNew) {
                if (!materiasOld.contains(materiasNewMateria)) {
                    materiasNewMateria.getEstudiantes().add(estudiante);
                    materiasNewMateria = em.merge(materiasNewMateria);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = estudiante.getId_Estudiante();
                if (findEstudiante(id) == null) {
                    throw new NonexistentEntityException("The estudiante with id " + id + " no longer exists.");
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
            Estudiante estudiante;
            try {
                estudiante = em.getReference(Estudiante.class, id);
                estudiante.getId_Estudiante();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The estudiante with id " + id + " no longer exists.", enfe);
            }
            List<SesionEstudio> sesionEstudio = estudiante.getSesionEstudio();
            for (SesionEstudio sesionEstudioSesionEstudio : sesionEstudio) {
                sesionEstudioSesionEstudio.setEstudiante(null);
                sesionEstudioSesionEstudio = em.merge(sesionEstudioSesionEstudio);
            }
            List<Materia> materias = estudiante.getMaterias();
            for (Materia materiasMateria : materias) {
                materiasMateria.getEstudiantes().remove(estudiante);
                materiasMateria = em.merge(materiasMateria);
            }
            em.remove(estudiante);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Estudiante> findEstudianteEntities() {
        return findEstudianteEntities(true, -1, -1);
    }

    public List<Estudiante> findEstudianteEntities(int maxResults, int firstResult) {
        return findEstudianteEntities(false, maxResults, firstResult);
    }

    private List<Estudiante> findEstudianteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Estudiante.class));
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

    public Estudiante findEstudiante(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Estudiante.class, id);
        } finally {
            em.close();
        }
    }

    public int getEstudianteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Estudiante> rt = cq.from(Estudiante.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
