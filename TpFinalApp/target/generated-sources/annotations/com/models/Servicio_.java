package com.models;

import com.models.Cliente;
import com.models.Incidente;
import com.models.Tecnico;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-06T22:46:55", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Servicio.class)
public class Servicio_ { 

    public static volatile ListAttribute<Servicio, Incidente> incidentes;
    public static volatile ListAttribute<Servicio, Tecnico> tecnicos;
    public static volatile SingularAttribute<Servicio, Integer> id;
    public static volatile ListAttribute<Servicio, Cliente> clientes;
    public static volatile SingularAttribute<Servicio, String> nombre;

}