package com.mycompany.studymind.logica;

import com.mycompany.studymind.logica.Materia;
import com.mycompany.studymind.logica.SesionEstudio;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-05-23T14:19:47", comments="EclipseLink-2.7.10.v20211216-rNA")
=======
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-05-22T11:42:30", comments="EclipseLink-2.7.10.v20211216-rNA")
>>>>>>> Registro-Ingreso
@StaticMetamodel(Estudiante.class)
public class Estudiante_ { 

    public static volatile SingularAttribute<Estudiante, Integer> id_Estudiante;
    public static volatile SingularAttribute<Estudiante, String> correo;
    public static volatile SingularAttribute<Estudiante, String> contrasenia;
    public static volatile ListAttribute<Estudiante, SesionEstudio> sesionEstudio;
    public static volatile SingularAttribute<Estudiante, String> nombre;
    public static volatile ListAttribute<Estudiante, Materia> materias;

}