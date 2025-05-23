package com.mycompany.studymind.persistencia;

import com.mycompany.studymind.logica.Estudiante;
import com.mycompany.studymind.logica.Materia;

public class ControladoraPersistencia {

EstudianteJpaController estudianteJpa = new EstudianteJpaController();
JuegosJpaController juegosJpa = new JuegosJpaController();
LinkJuegoJpaController linkJuegoJpa = new LinkJuegoJpaController();
MateriaJpaController materiaJpa = new MateriaJpaController();
SesionEstudioJpaController sesionEstudioJpa = new SesionEstudioJpaController();

    public void guardar(Estudiante estudiante) {

        estudianteJpa.create(estudiante);

    }
    
    public void guardarMateria(Materia materia) {
    materiaJpa.create(materia);
}
    
}
