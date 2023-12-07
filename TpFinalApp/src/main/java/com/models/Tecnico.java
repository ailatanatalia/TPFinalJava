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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Satan
 */


@Entity
@Table(name = "tecnicos")
public class Tecnico implements Serializable {
    //atributos: datos tecnico
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int DNI;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "forma_notif")
    private String noti;
    @Column(name = "disponibilidad")
    private boolean dispo;
    
    //atributos: servicio - cada tecnico trabaja en un solo servicio
    @ManyToOne
    @JoinColumn(name="servicio_id", referencedColumnName="id")
    private Servicio servicio;
    //atributos: incidente
    @OneToMany(mappedBy="tecnico", cascade = CascadeType.ALL)
    private ArrayList<Incidente> incidentes = new ArrayList(); 

    public Tecnico() {
    }

    public Tecnico(int DNI, String nombre, String apellido, String noti, Servicio servicio) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.noti = noti;
        this.servicio = servicio;
        this.dispo = true;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNoti(String noti) {
        this.noti = noti;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    public void setIncidentes(ArrayList<Incidente> incidentes) {
        this.incidentes = incidentes;
    }
    
    

    public int getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNoti() {
        return noti;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public boolean isDispo() {
        return dispo;
    }

    public ArrayList<Incidente> getIncidentes() {
        return incidentes;
    }

    @Override
    public String toString() {
        return "Tecnico{" + "DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", noti=" + noti + ", dispo=" + dispo + '}';
    }
 
    
}
