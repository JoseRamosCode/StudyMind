package com.mycompany.studymind.persistencia;

import com.mycompany.studymind.logica.Estudiante;
import com.mycompany.studymind.logica.Materia;
import com.mycompany.studymind.logica.SesionEstudio;
import com.mycompany.studymind.persistencia.exceptions.NonexistentEntityException;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ControladoraPersistencia {

    private final EstudianteJpaController estudianteJpa = new EstudianteJpaController();
    private final JuegosJpaController juegosJpa = new JuegosJpaController();
    private final LinkJuegoJpaController linkJuegoJpa = new LinkJuegoJpaController();
    private final MateriaJpaController materiaJpa = new MateriaJpaController();
    private final SesionEstudioJpaController sesionEstudioJpa = new SesionEstudioJpaController();

    private static final Logger LOGGER = Logger.getLogger(ControladoraPersistencia.class.getName());

    // ===================== Métodos Auxiliares ===================== //
    private <T> List<T> safeList(List<T> list) {
        return list != null ? list : List.of();
    }

    private boolean ejecutarConErrores(Runnable accion, String mensajeError) {
        try {
            accion.run();
            return true;
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, mensajeError, e);
            return false;
        }
    }

    private boolean existeEstudiantePorPropiedad(List<Estudiante> lista, String valor, String propiedad) {
        return lista.stream().anyMatch(est ->
            ("correo".equals(propiedad) && est.getCorreo().equalsIgnoreCase(valor)) ||
            ("nombre".equals(propiedad) && est.getNombre().equalsIgnoreCase(valor))
        );
    }

    private boolean eliminarEntidad(Object entidad, Consumer<Object> eliminador, String mensajeError) {
        return ejecutarConErrores(() -> eliminador.accept(entidad), mensajeError);
    }

    private void crearOActualizarSesion(SesionEstudio sesion, Estudiante estudiante, Materia materia, int segundosEstudio) {
        if (sesion == null) {
            SesionEstudio nuevaSesion = new SesionEstudio();
            nuevaSesion.setEstudiante(estudiante);
            nuevaSesion.setMateria(materia);
            nuevaSesion.setTiempoEstudio(segundosEstudio);
            guardarSesionEstudio(nuevaSesion);
        } else {
            sesion.setTiempoEstudio(sesion.getTiempoEstudio() + segundosEstudio);
            editarSesionEstudioSegura(sesion);
        }
    }

    private void editarSesionEstudioSegura(SesionEstudio sesion) {
        ejecutarConErrores(() -> {
            try {
                sesionEstudioJpa.edit(sesion);
            } catch (Exception ex) {
                Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }, "Error al editar sesión de estudio");
    }

    // ===================== Métodos Públicos ===================== //

    public boolean guardarEstudiante(Estudiante estudiante) {
        return ejecutarConErrores(() -> estudianteJpa.create(estudiante), "Error al guardar estudiante");
    }

    public boolean actualizarEstudiante(Estudiante estudiante) {
        return ejecutarConErrores(() -> {
            try {
                estudianteJpa.edit(estudiante);
            } catch (Exception ex) {
                Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }, "Error al actualizar estudiante");
    }

    public boolean eliminarEstudiante(Estudiante estudiante) {
        return eliminarEntidad(estudiante, e -> {
            try {
                estudianteJpa.destroy(estudiante.getId_Estudiante());
            } catch (NonexistentEntityException ex) {
                LOGGER.log(Level.SEVERE, "Error al eliminar estudiante", ex);
            }
        }, "Error al eliminar estudiante");
    }

    public Estudiante traerEstudiantePorId(int id) {
        return estudianteJpa.findEstudiante(id);
    }

    public List<Estudiante> traerUsuarios() {
        return safeList(estudianteJpa.findEstudianteEntities());
    }

    public boolean estudianteExiste(String nombre, String correo) {
        List<Estudiante> lista = traerUsuarios();
        return existeEstudiantePorPropiedad(lista, correo, "correo") ||
               existeEstudiantePorPropiedad(lista, nombre, "nombre");
    }

    public boolean guardarMateria(Materia materia) {
        return ejecutarConErrores(() -> materiaJpa.create(materia), "Error al guardar materia");
    }

    public boolean editarMateria(Materia materia) {
        return ejecutarConErrores(() -> {
            try {
                materiaJpa.edit(materia);
            } catch (Exception ex) {
                Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }, "Error al actualizar materia");
    }

    public boolean eliminarMateria(Materia materia) {
        return eliminarEntidad(materia, m -> {
            try {
                materiaJpa.destroy(materia.getId_Materia());
            } catch (NonexistentEntityException ex) {
                LOGGER.log(Level.SEVERE, "Error al eliminar materia", ex);
            }
        }, "Error al eliminar materia");
    }

    public List<Materia> obtenerTodasLasMaterias() {
        return safeList(materiaJpa.findMateriaEntities());
    }

    public void registrarSesionEstudio(Estudiante estudiante, Materia materia, int segundosEstudio) {
        Optional<SesionEstudio> sesion = buscarSesionPorEstudianteYMateria(estudiante, materia);
        crearOActualizarSesion(sesion.orElse(null), estudiante, materia, segundosEstudio);
    }

    public Optional<SesionEstudio> buscarSesionPorEstudianteYMateria(Estudiante estudiante, Materia materia) {
        return safeList(sesionEstudioJpa.findSesionEstudioEntities()).stream()
                .filter(s -> s.getEstudiante().getId_Estudiante() == estudiante.getId_Estudiante()
                        && s.getMateria().getId_Materia() == materia.getId_Materia())
                .findFirst();
    }

    public boolean guardarSesionEstudio(SesionEstudio sesion) {
        return ejecutarConErrores(() -> sesionEstudioJpa.create(sesion), "Error al guardar sesión de estudio");
    }

    public boolean editarSesionEstudio(SesionEstudio sesion) {
        return ejecutarConErrores(() -> {
            try {
                sesionEstudioJpa.edit(sesion);
            } catch (Exception ex) {
                Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }, "Error al editar sesión de estudio");
    }

    public List<SesionEstudio> obtenerSesionesEstudioDelEstudiante(Estudiante estudiante) {
        return safeList(sesionEstudioJpa.findSesionEstudioEntities()).stream()
                .filter(s -> s.getEstudiante().getId_Estudiante() == estudiante.getId_Estudiante())
                .collect(Collectors.toList());
    }
}
