 package com.mycompany.studymind.logica;

import com.mycompany.studymind.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
 
import java.util.List;
import javax.persistence.EntityManager;

 
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombre, String correo,String contrasenia) {
        
        //Creamos al estudiante y le asignamos sus valores.
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(nombre);
        estudiante.setCorreo(correo);
        estudiante.setContrasenia(contrasenia);
        
        controlPersis.guardar(estudiante);
        
        
        
    }

    public Estudiante validarEstudiante(String correo, String contrasenia) {
        List<Estudiante> listaEstudiantes = controlPersis.traerUsuarios();
        
        for(Estudiante estudiante: listaEstudiantes){
            if(estudiante.getCorreo().equals(correo) && estudiante.getContrasenia().equals(contrasenia)){
                return estudiante;
            }
        }
        return null;
    }
   public boolean actualizarEstudiante(Estudiante estudiante) {
    return controlPersis.actualizar(estudiante);
}
   
public Estudiante traerEstudiantePorId(int id) {
    return controlPersis.traerEstudiantePorId(id);
}

 public void guardarMateria(String materia, String docente, String prioridad, Estudiante estudiante) {
        
        Materia materia_ = new Materia();
        materia_.setNombre(materia);
        materia_.setDocente(docente);
        materia_.setImportancia(prioridad);
        
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(estudiante);
        materia_.setEstudiantes(estudiantes);
        
        controlPersis.guardarMateria(materia_);
       
    }
 
public List<Materia> obtenerMateriasDelEstudiante(Estudiante estudiante) {
    List<Materia> todas = controlPersis.obtenerTodasLasMaterias();
    List<Materia> asociadas = new ArrayList<>();

    for (Materia m : todas) {
        for (Estudiante e : m.getEstudiantes()) {
            if (e.getId() == estudiante.getId()) {
                asociadas.add(m);
                break;
            }
        }
    }

    return asociadas;
}
}



 

