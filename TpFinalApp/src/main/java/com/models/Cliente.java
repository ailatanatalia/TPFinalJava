package com.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//import lombok.Setter;

/**
 *
 * @author Satan
 */

//@Setter

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {
    //atributos: datos cliente
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String cuit;
    
    @Basic
    @Column(name = "razon_social")
    private String razonSocial;
    @Column(name = "email")
    private String email;
    @Column(name = "telefono")
    private int tel;
    
    //atributos: incidente
    @OneToMany(mappedBy="cliente", cascade = CascadeType.ALL)
    private List<Incidente> incidentes = new ArrayList(); 
    //atributos: servicios
    @ManyToMany
    @JoinTable(name = "clientes_servicios", 
            joinColumns = @JoinColumn(name = "cliente_cuit"), 
            inverseJoinColumns = @JoinColumn(name = "servicio_id"))
    private List<Servicio> servicios = new ArrayList();

    public Cliente() {
    }

    public Cliente(String cuit, String razonSocial, String email, int tel) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.email = email;
        this.tel = tel;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public void setIncidentes(ArrayList<Incidente> incidentes) {
        this.incidentes = incidentes;
    }

    

    public String getCuit() {
        return cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getEmail() {
        return email;
    }

    public int getTel() {
        return tel;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public List<Incidente> getIncidentes() {
        return incidentes;
    }

    @Override
    public String toString() {
        String sep = "---".repeat(50);
        String strTemp1 = "";
        for (Servicio serv : servicios){
            strTemp1 += " " + serv.getNombre() + " ";
                    }
        String strTemp2 = "";
        for (Incidente in : incidentes){
            strTemp2 += " " + in.getId() + " ";
                    }

        return "Cliente{" + "cuit=" + cuit + ", razonSocial=" + razonSocial 
                + ", email=" + email + ", tel=" + tel + '}' 
                + "\n" + "servicios:" + strTemp1
                + "\n" + "Incidentes id:" + strTemp2 
                + "\n" + sep;
//
//servicios.stream().forEach(serv) -> System.out.println(serv.getNombre())   
    }

    


}
