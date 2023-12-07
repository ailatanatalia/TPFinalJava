package com.controllers;

import com.models.Tecnico;
import java.util.ArrayList;

public class RRHHController {
    
PersistenceController control = new PersistenceController();
//************************************************************************************************
//Tecnicos: CRUD
    public void crearTecnico(Tecnico tec)
    {   
        control.crearTecnico(tec);
    }
    
    public void eliminarTecnico(int DNI)
    {   
        control.eliminarTecnico(DNI);
    }
    
    public void editarTecnico(Tecnico tec)
    {   
        control.editarTecnico(tec);
    }

    public Tecnico buscarTecnico(int DNI)
    {  
       Tecnico tec = new Tecnico();
       tec = control.buscarTecnico(DNI);
       return tec; 
    }

    public ArrayList<Tecnico> listaTecnico()
    {   
       ArrayList <Tecnico> tecnicos = new ArrayList();
       tecnicos = control.listaTecnico();
       return tecnicos; 
    }

}
