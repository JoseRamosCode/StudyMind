package com.mycompany.studymind.logica;

import com.mycompany.studymind.logica.Estudiante;
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
@StaticMetamodel(Materia.class)
public class Materia_ { 

    public static volatile SingularAttribute<Materia, String> descripcion;
    public static volatile SingularAttribute<Materia, Integer> id_Materia;
    public static volatile ListAttribute<Materia, Estudiante> estudiantes;
    public static volatile ListAttribute<Materia, SesionEstudio> sesionesEstudio;
    public static volatile SingularAttribute<Materia, String> nombre;

}