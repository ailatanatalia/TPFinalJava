package com.controllers;

import com.models.Cliente;
import com.models.Servicio;
import java.util.ArrayList;

public class AreaComController {
    
    PersistenceController control = new PersistenceController();
    
//************************************************************************************************
//Clientes: CRUD
    public void crearCliente(Cliente cli)
    {   
        control.crearCliente(cli);
    }
    
    public void eliminarCliente(String cuit)
    {   
        control.eliminarCliente(cuit);
    }
    
    public void editarCliente(Cliente cli)
    {   
        control.editarCliente(cli);
    }

    public Cliente buscarCliente(String cuit)
    {  
       Cliente cli = new Cliente();
       cli = control.buscarCliente(cuit);
       return cli; 
    }

    public ArrayList<Cliente> listaCliente()
    {   
       ArrayList <Cliente> clientes = new ArrayList();
       clientes = control.listaCliente();
       return clientes; 
    }
//************************************************************************************************
//servicio: CRUD
    public void crearServicio(Servicio serv)
    {   
        control.crearServicio(serv);
    }
    
    public void eliminarServicio(int id)
    {   
        control.eliminarServicio(id);
    }
    
    public void editarServicio(Servicio serv)
    {   
        control.editarServicio(serv);
    }

    public Servicio buscarServicio(int id)
    {  
       Servicio serv = new Servicio();
       serv = control.buscarServicio(id);
       return serv; 
    }

    public ArrayList<Servicio> listaServicio()
    {   
       ArrayList <Servicio> servicios = new ArrayList();
       servicios = control.listaServicio();
       return servicios; 
    }

    
}
