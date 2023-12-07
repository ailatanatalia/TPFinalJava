package com.controllers;

import com.models.Incidente;
import java.util.ArrayList;

public class MesaAyudaController {
    
    PersistenceController control = new PersistenceController();
    
//************************************************************************************************
//incidentes: CRUD
    public void crearIncidente(Incidente in)
    {   
        control.crearIncidente(in);
    }
    
    public void eliminarIncidente(int id)
    {   
        control.eliminarIncidente(id);
    }
    
    public void editarIncidente(Incidente in)
    {   
        control.editarIncidente(in);
    }

    public Incidente buscarIncidente(int id)
    {  
       Incidente in = new Incidente();
       in = control.buscarIncidente(id);
       return in; 
    }

    public ArrayList<Incidente> listaIncidente()
    {   
       ArrayList <Incidente> incidentes = new ArrayList();
       incidentes = control.listaIncidente();
       return incidentes; 
    }
    
}
