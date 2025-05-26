
package com.mycompany.studymind.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Estudiante implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_Estudiante;
    private String nombre,correo,contrasenia;
    @OneToMany(mappedBy = "estudiante", cascade = CascadeType.ALL)
    private List<SesionEstudio> sesionEstudio;
    
    @ManyToMany
     @JoinTable(
             name = "estudiante_materia",
             joinColumns = @JoinColumn(name = "id_Estudiante"),
             inverseJoinColumns = @JoinColumn(name = "id_Materia")
     )
     
    private  List<Materia_backup> materias;

    public Estudiante() {
    }

    public Estudiante(int id_Estudiante, String nombre, String correo, String contrasenia, List<SesionEstudio> sesionEstudio, List<Materia_backup> materias) {
        this.id_Estudiante = id_Estudiante;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.sesionEstudio = sesionEstudio;
        this.materias = materias;
    }

    public int getId_Estudiante() {
        return id_Estudiante;
    }

    public void setId_Estudiante(int id_Estudiante) {
        this.id_Estudiante = id_Estudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public List<SesionEstudio> getSesionEstudio() {
        return sesionEstudio;
    }

    public void setSesionEstudio(List<SesionEstudio> sesionEstudio) {
        this.sesionEstudio = sesionEstudio;
    }

    public List<Materia_backup> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia_backup> materias) {
        this.materias = materias;
    }
    
    
}
