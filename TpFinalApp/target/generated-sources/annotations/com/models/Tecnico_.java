package com.models;

import com.models.Incidente;
import com.models.Servicio;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-06T22:46:55", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Tecnico.class)
public class Tecnico_ { 

    public static volatile ListAttribute<Tecnico, Incidente> incidentes;
    public static volatile SingularAttribute<Tecnico, Servicio> servicio;
    public static volatile SingularAttribute<Tecnico, String> noti;
    public static volatile SingularAttribute<Tecnico, String> apellido;
    public static volatile SingularAttribute<Tecnico, String> nombre;
    public static volatile SingularAttribute<Tecnico, Integer> DNI;
    public static volatile SingularAttribute<Tecnico, Boolean> dispo;

}