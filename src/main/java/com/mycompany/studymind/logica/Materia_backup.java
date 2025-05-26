package com.mycompany.studymind.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Materia_backup implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_Materia;
    private String nombre,docente,importancia;
    
    @ManyToMany(mappedBy = "materias")
    private List<Estudiante> estudiantes;
    
    @OneToMany(mappedBy = "materia", cascade = CascadeType.ALL)
    private List<SesionEstudio> sesionesEstudio;

    public Materia_backup() {
    }

    public Materia_backup(int id_Materia, String nombre, String docente, String importancia, List<Estudiante> estudiantes, List<SesionEstudio> sesionesEstudio) {
        this.id_Materia = id_Materia;
        this.nombre = nombre;
        this.docente = docente;
        this.importancia = importancia;
        this.estudiantes = estudiantes;
        this.sesionesEstudio = sesionesEstudio;
    }

   

    public int getId_Materia() {
        return id_Materia;
    }

    public void setId_Materia(int id_Materia) {
        this.id_Materia = id_Materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getImportancia() {
        return importancia;
    }

    public void setImportancia(String importancia) {
        this.importancia = importancia;
    }

    

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<SesionEstudio> getSesionesEstudio() {
        return sesionesEstudio;
    }

    public void setSesionesEstudio(List<SesionEstudio> sesionesEstudio) {
        this.sesionesEstudio = sesionesEstudio;
    }

    void setDescripcion(String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
