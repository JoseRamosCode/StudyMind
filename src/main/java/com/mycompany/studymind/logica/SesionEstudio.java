
package com.mycompany.studymind.logica;

import java.io.Serializable;
import java.util.List;
import java.util.Timer;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class SesionEstudio implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_Sesion;
    private String nombre,descripcion;
//    private Timer tiempo;
    
    @ManyToOne
    @JoinColumn(name = "id_Estudiante")
    private Estudiante estudiante;
    
    @ManyToOne
    @JoinColumn(name = "id_Materia")
    private Materia materia;
    
    @OneToMany(mappedBy = "sesionEstudio",cascade = CascadeType.ALL)
    private List<Juegos> juegos;
    
    public SesionEstudio() {
    }

    public SesionEstudio(int id_Sesion, String nombre, String descripcion, Estudiante estudiante, Materia materia, List<Juegos> juegos) {
        this.id_Sesion = id_Sesion;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estudiante = estudiante;
        this.materia = materia;
        this.juegos = juegos;
    }

  

    

    public int getId_Sesion() {
        return id_Sesion;
    }

    public void setId_Sesion(int id_Sesion) {
        this.id_Sesion = id_Sesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public List<Juegos> getJuegos() {
        return juegos;
    }

    public void setJuegos(List<Juegos> juegos) {
        this.juegos = juegos;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

   
    
    
    
}
