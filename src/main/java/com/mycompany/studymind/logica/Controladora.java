 package com.mycompany.studymind.logica;

import com.mycompany.studymind.persistencia.ControladoraPersistencia;

 
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
    
}
