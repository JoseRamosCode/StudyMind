package com.mycompany.studymind.logica;

import com.mycompany.studymind.logica.Estudiante;
import com.mycompany.studymind.logica.Juegos;
import java.util.Timer;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-05-14T12:29:40", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(SesionEstudio.class)
public class SesionEstudio_ { 

    public static volatile SingularAttribute<SesionEstudio, String> descripcion;
    public static volatile SingularAttribute<SesionEstudio, Estudiante> estudiante;
    public static volatile ListAttribute<SesionEstudio, Juegos> juegos;
    public static volatile SingularAttribute<SesionEstudio, Integer> id_Sesion;
    public static volatile SingularAttribute<SesionEstudio, Timer> tiempo;
    public static volatile SingularAttribute<SesionEstudio, String> nombre;

}