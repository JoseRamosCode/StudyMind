package com.mycompany.studymind.logica;

import com.mycompany.studymind.igu.SignUp.Encriptacion;
import com.mycompany.studymind.persistencia.ControladoraPersistencia;

import java.util.*;
import java.util.stream.Collectors;

public class Controladora {

    private final ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    // ===================== Estudiante ===================== //

    public void guardarEstudiante(String nombre, String correo, String contrasenia) {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(nombre);
        estudiante.setCorreo(correo);
        estudiante.setContrasenia(Encriptacion.encriptarContrasenia(contrasenia));
        controlPersis.guardarEstudiante(estudiante);
    }

    public Estudiante validarEstudiante(String correo, String contraseniaEncriptada) {
        return obtenerTodosLosEstudiantes().stream()
                .filter(e -> e.getCorreo().equals(correo) && e.getContrasenia().equals(contraseniaEncriptada))
                .findFirst()
                .orElse(null);
    }

    public boolean actualizarEstudiante(Estudiante estudiante) {
        return controlPersis.actualizarEstudiante(estudiante);
    }

    public Estudiante traerEstudiantePorId(int id) {
        return controlPersis.traerEstudiantePorId(id);
    }

    public List<Estudiante> traerEstudiantes() {
        return obtenerTodosLosEstudiantes();
    }

    public boolean eliminarEstudiante(Estudiante estudiante) {
        return controlPersis.eliminarEstudiante(estudiante);
    }

    public boolean existeEstudiante(String nombre, String correo) {
        return controlPersis.estudianteExiste(nombre, correo);
    }

    public boolean existeNombreEnOtroEstudiante(String nombre, int idActual) {
        return obtenerTodosLosEstudiantes().stream()
                .anyMatch(est -> est.getNombre().equalsIgnoreCase(nombre) && est.getId_Estudiante() != idActual);
    }

    // ===================== Materia ===================== //

    public boolean guardarMateria(String nombre, String docente, String prioridad, Estudiante estudiante) {
        if (materiaYaExiste(estudiante, nombre)) return false;

        return ejecutarConControlDeErrores(() -> {
            Materia materia = crearMateria(nombre, docente, prioridad, estudiante);
            controlPersis.guardarMateria(materia);
        }, "Error al guardar materia");
    }

    public boolean actualizarMateria(Materia materia, String nuevoNombre, String nuevoDocente, String nuevaImportancia) {
        return ejecutarConControlDeErrores(() -> {
            materia.setNombre(nuevoNombre);
            materia.setDocente(nuevoDocente);
            materia.setImportancia(nuevaImportancia);
            controlPersis.editarMateria(materia);
        }, "Error al actualizar materia");
    }

    public boolean eliminarMateria(Materia materia) {
        return ejecutarConControlDeErrores(() -> controlPersis.eliminarMateria(materia), "Error al eliminar materia");
    }

    public Materia obtenerMateriaPorNombreYDocente(Estudiante estudiante, String nombre, String docente) {
        return buscarMateria(obtenerMateriasDelEstudiante(estudiante), nombre, docente);
    }

    public Materia buscarMateriaPorNombre(Estudiante estudiante, String nombreMateria) {
        return buscarMateria(obtenerMateriasDelEstudiante(estudiante), nombreMateria, null);
    }

    public List<Materia> obtenerMateriasDelEstudiante(Estudiante estudiante) {
        return obtenerTodasLasMaterias().stream()
                .filter(m -> m.getEstudiantes().stream()
                        .anyMatch(e -> e.getId() == estudiante.getId()))
                .collect(Collectors.toList());
    }

    public boolean materiaYaExiste(Estudiante estudiante, String nombreMateria) {
        return obtenerMateriasDelEstudiante(estudiante).stream()
                .anyMatch(m -> m.getNombre().equalsIgnoreCase(nombreMateria));
    }

    // ===================== Sesiones de Estudio ===================== //

    public void registrarEstudio(Estudiante estudiante, Materia materia, int segundosEstudio) {
        controlPersis.registrarSesionEstudio(estudiante, materia, segundosEstudio);
    }

    public Map<String, Integer> obtenerTiempoEstudioPorMateria(Estudiante estudiante) {
        return controlPersis.obtenerSesionesEstudioDelEstudiante(estudiante).stream()
                .collect(Collectors.groupingBy(
                        sesion -> sesion.getMateria().getNombre(),
                        Collectors.summingInt(SesionEstudio::getTiempoEstudio)
                ));
    }

    // ===================== Métodos auxiliares ===================== //

    private List<Estudiante> obtenerTodosLosEstudiantes() {
        return controlPersis.traerUsuarios();
    }

    private List<Materia> obtenerTodasLasMaterias() {
        return controlPersis.obtenerTodasLasMaterias();
    }

    private Materia crearMateria(String nombre, String docente, String importancia, Estudiante estudiante) {
        Materia materia = new Materia();
        materia.setNombre(nombre);
        materia.setDocente(docente);
        materia.setImportancia(importancia);
        materia.setEstudiantes(List.of(estudiante));
        return materia;
    }

    private Materia buscarMateria(List<Materia> materias, String nombre, String docente) {
        return materias.stream()
                .filter(m -> m.getNombre().equalsIgnoreCase(nombre)
                        && (docente == null || m.getDocente().equals(docente)))
                .findFirst()
                .orElse(null);
    }

    private boolean ejecutarConControlDeErrores(Runnable accion, String mensajeError) {
        try {
            accion.run();
            return true;
        } catch (Exception e) {
            System.err.println(mensajeError + ": " + e.getMessage());
            return false;
        }
    }
}
