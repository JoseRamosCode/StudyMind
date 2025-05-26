 package com.mycompany.studymind.logica;

import com.mycompany.studymind.persistencia.ControladoraPersistencia;
 
import java.util.List;

 
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
    

}
