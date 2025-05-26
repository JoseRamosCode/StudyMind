package com.mycompany.studymind.logica;

import com.mycompany.studymind.logica.Materia_backup;
import com.mycompany.studymind.logica.SesionEstudio;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-05-25T23:45:10", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Estudiante.class)
public class Estudiante_ { 

    public static volatile SingularAttribute<Estudiante, Integer> id_Estudiante;
    public static volatile SingularAttribute<Estudiante, String> correo;
    public static volatile SingularAttribute<Estudiante, String> contrasenia;
    public static volatile ListAttribute<Estudiante, SesionEstudio> sesionEstudio;
    public static volatile SingularAttribute<Estudiante, String> nombre;
    public static volatile ListAttribute<Estudiante, Materia_backup> materias;

}