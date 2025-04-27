 
package com.mycompany.studymind.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LinkJuego implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_Link;
    
    private String url;
    
    @ManyToOne
    @JoinColumn(name = "id_Juegos")
    private Juegos juego;

    public LinkJuego() {
    }

    public LinkJuego(int id_Link, String url, Juegos juego) {
        this.id_Link = id_Link;
        this.url = url;
        this.juego = juego;
    }

    public int getId_Link() {
        return id_Link;
    }

    public void setId_Link(int id_Link) {
        this.id_Link = id_Link;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Juegos getJuego() {
        return juego;
    }

    public void setJuego(Juegos juego) {
        this.juego = juego;
    }
    
    
    
}
