package com.models;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Satan
 */
@Entity
@Table(name = "servicios")
public class Servicio implements Serializable {
 
    //atributos: datos tecnico
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    
    //atributos: cliente 
    @ManyToMany(mappedBy="servicios")
    private ArrayList<Cliente> clientes = new ArrayList(); 
    //atributos: incidentes
    @OneToMany(mappedBy="servicio", cascade = CascadeType.ALL)
    private ArrayList<Incidente> incidentes = new ArrayList(); 
    //atributos: tecnicos
    @OneToMany(mappedBy="servicio", cascade = CascadeType.ALL)
    private ArrayList<Tecnico> tecnicos = new ArrayList(); 
    
    
    public Servicio() {
    }

    public Servicio(String nombre) {
        this.nombre = nombre;
    }
        
    public int getId() {
        return id;
    }
/*
    public void setId(int id) {
        this.id = id;
    }
*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(ArrayList<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

    public ArrayList<Incidente> getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(ArrayList<Incidente> incidentes) {
        this.incidentes = incidentes;
    }

    
    
}
