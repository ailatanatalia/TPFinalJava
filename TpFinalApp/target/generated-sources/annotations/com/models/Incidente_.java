package com.models;

import com.models.Cliente;
import com.models.Servicio;
import com.models.Tecnico;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-06T22:46:55", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Incidente.class)
public class Incidente_ { 

    public static volatile SingularAttribute<Incidente, String> descripcion;
    public static volatile SingularAttribute<Incidente, Cliente> cliente;
    public static volatile SingularAttribute<Incidente, Servicio> servicio;
    public static volatile SingularAttribute<Incidente, Date> fechaRegistro;
    public static volatile SingularAttribute<Incidente, Date> fechaResEstimada;
    public static volatile SingularAttribute<Incidente, Integer> id;
    public static volatile SingularAttribute<Incidente, Tecnico> tecnico;
    public static volatile SingularAttribute<Incidente, String> dificultad;
    public static volatile SingularAttribute<Incidente, Boolean> resuelto;

}