package com.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Satan
 */
@Entity
@Table(name = "incidentes")
public class Incidente implements Serializable{
    
    //atributos: datos incidente
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Basic
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "dificultad")
    private String dificultad;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Column(name = "fecha_res_estimada")
    @Temporal(TemporalType.DATE)
    private Date fechaResEstimada;
    @Column(name = "resuelto")
    private boolean resuelto;
    
    private enum dificultades {ALTA, MEDIA, BAJA};
    
//atributos: cliente
    @ManyToOne
    @JoinColumn(name="cliente_cuit", referencedColumnName="cuit")
    private Cliente cliente;
    //atributos: servicio
    @ManyToOne
    @JoinColumn(name="servicio_id", referencedColumnName="id")
    private Servicio servicio;
    //atributos: tecnico - cada incidente tiene un solo tecnico
    @ManyToOne
    @JoinColumn(name="tecnico_dni", referencedColumnName="DNI")
    private Tecnico tecnico;

    public Incidente() {
    }

    public Incidente(String descripcion, Date fechaRegistro, Date fechaResEstimada, boolean resuelto, Cliente cliente, Servicio servicio) {
        this.descripcion = descripcion;
        this.fechaRegistro = fechaRegistro;
        this.fechaResEstimada = fechaResEstimada;
        this.resuelto = resuelto;
        this.cliente = cliente;
        this.servicio = servicio;
    }

    public int getId() {
        return id;
    }

/*
    public void setId(int id) {
        this.id = id;
    }
*/
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultades.valueOf(dificultad).toString();
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaResEstimada() {
        return fechaResEstimada;
    }

    public void setFechaResEstimada(Date fechaResEstimada) {
        this.fechaResEstimada = fechaResEstimada;
    }

    public boolean isResuelto() {
        return resuelto;
    }

    public void setResuelto(boolean resuelto) {
        this.resuelto = resuelto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    
    
}
