package com.mycompany.studymind.logica;

import com.mycompany.studymind.logica.LinkJuego;
import com.mycompany.studymind.logica.SesionEstudio;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-05-23T14:19:47", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Juegos.class)
public class Juegos_ { 

    public static volatile SingularAttribute<Juegos, String> Categoria;
    public static volatile SingularAttribute<Juegos, Integer> id_Juegos;
    public static volatile ListAttribute<Juegos, LinkJuego> links;
    public static volatile SingularAttribute<Juegos, SesionEstudio> sesionEstudio;

}