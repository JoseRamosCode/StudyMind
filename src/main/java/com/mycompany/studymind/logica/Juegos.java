
package com.mycompany.studymind.logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Juegos implements Serializable {
    
    
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_Juegos;
    
    private String Categoria;
    
    @OneToMany(mappedBy = "juego",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<LinkJuego> links = new ArrayList<>();
    
    @ManyToOne
    @JoinColumn(name = "id_Sesion")
    private SesionEstudio sesionEstudio;
    
    public Juegos() {
    }

    public Juegos(int id_Juegos, String Categoria, SesionEstudio sesionEstudio) {
        this.id_Juegos = id_Juegos;
        this.Categoria = Categoria;
        this.sesionEstudio = sesionEstudio;
    }

    

    public int getId_Juegos() {
        return id_Juegos;
    }

    public void setId_Juegos(int id_Juegos) {
        this.id_Juegos = id_Juegos;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public List<LinkJuego> getLinks() {
        return links;
    }

    public void setLinks(List<LinkJuego> links) {
        this.links = links;
    }

    public SesionEstudio getSesionEstudio() {
        return sesionEstudio;
    }

    public void setSesionEstudio(SesionEstudio sesionEstudio) {
        this.sesionEstudio = sesionEstudio;
    }

    
    
    
}


    
