package com.models;

import com.models.Incidente;
import com.models.Servicio;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-06T22:46:55", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile ListAttribute<Cliente, Servicio> servicios;
    public static volatile ListAttribute<Cliente, Incidente> incidentes;
    public static volatile SingularAttribute<Cliente, String> razonSocial;
    public static volatile SingularAttribute<Cliente, String> cuit;
    public static volatile SingularAttribute<Cliente, Integer> tel;
    public static volatile SingularAttribute<Cliente, String> email;

}