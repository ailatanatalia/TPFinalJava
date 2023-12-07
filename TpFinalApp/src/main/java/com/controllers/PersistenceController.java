package com.controllers;

import com.controllers.exceptions.NonexistentEntityException;
import com.models.Cliente;
import com.models.Incidente;
import com.models.Servicio;
import com.models.Tecnico;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Satan
 */
public class PersistenceController {
    
    ClienteJpaController cliJPA = new ClienteJpaController();
    TecnicoJpaController tecJPA = new TecnicoJpaController();
    ServicioJpaController servJPA = new ServicioJpaController();
    IncidenteJpaController inJPA = new IncidenteJpaController();

//*********************************************************************************
//clientes
    public void crearCliente(Cliente cli) 
    {
        cliJPA.create(cli);
    }

    public void eliminarCliente(String cuit) 
    {
        try { 
            cliJPA.destroy(cuit);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCliente(Cliente cli) 
    {
        try { 
            cliJPA.edit(cli);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cliente buscarCliente(String cuit) 
    {
        return cliJPA.findCliente(cuit);
    }

    public ArrayList<Cliente> listaCliente() 
    {
        List<Cliente> listaTemp = cliJPA.findClienteEntities();
        ArrayList<Cliente> lista = new ArrayList(listaTemp);
        return lista;
    }

//*********************************************************************************   
//tecnicos
    public void crearTecnico(Tecnico tec) 
    {
        tecJPA.create(tec);
    }

    public void eliminarTecnico(int DNI) 
    {
        try { 
            tecJPA.destroy(DNI);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarTecnico(Tecnico tec) 
    {
        try { 
            tecJPA.edit(tec);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Tecnico buscarTecnico(int DNI) 
    {
        return tecJPA.findTecnico(DNI);
    }

    public ArrayList<Tecnico> listaTecnico() 
    {
        List<Tecnico> listaTemp = tecJPA.findTecnicoEntities();
        ArrayList<Tecnico> lista = new ArrayList(listaTemp);
        return lista;
    }
//*********************************************************************************
//servicios
    public void crearServicio(Servicio serv) 
    {
        servJPA.create(serv);
    }

    public void eliminarServicio(int id) 
    {
        try { 
            servJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarServicio(Servicio serv) 
    {
        try { 
            servJPA.edit(serv);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Servicio buscarServicio(int id) 
    {
        return servJPA.findServicio(id);
    }

    public ArrayList<Servicio> listaServicio() 
    {
        List<Servicio> listaTemp = servJPA.findServicioEntities();
        ArrayList<Servicio> lista = new ArrayList(listaTemp);
        return lista;
    }

 //*********************************************************************************
//incidentes
    public void crearIncidente(Incidente in) 
    {
        inJPA.create(in);
    }

    public void eliminarIncidente(int id) 
    {
        try { 
            inJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarIncidente(Incidente in) 
    {
        try { 
            inJPA.edit(in);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Incidente buscarIncidente(int in) 
    {
        return inJPA.findIncidente(in);
    }

    public ArrayList<Incidente> listaIncidente() 
    {
        List<Incidente> listaTemp = inJPA.findIncidenteEntities();
        ArrayList<Incidente> lista = new ArrayList(listaTemp);
        return lista;
    }

//*********************************************************************************   

}
