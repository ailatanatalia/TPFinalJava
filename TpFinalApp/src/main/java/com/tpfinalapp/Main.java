package com.tpfinalapp;

import com.controllers.AreaComController;
import com.controllers.MesaAyudaController;
import com.controllers.RRHHController;
import com.models.Cliente;
import com.models.Incidente;
import com.models.Servicio;
import com.models.Tecnico;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Satan
 */
public class Main {

    public static void main(String[] args) {
        
        AreaComController ac = new AreaComController();
        RRHHController rrhh = new RRHHController();
        MesaAyudaController ma = new MesaAyudaController();
        
        //TESTEO CRUD A MANO

//************************************************************************************************
//crear servicio
///*
        Servicio serv1 = new Servicio("LINUX");
///*
        Servicio serv2 = new Servicio("WINDOWS");
        Servicio serv3 = new Servicio("TANGO");
        ac.crearServicio(serv1);
        ac.crearServicio(serv2);
        ac.crearServicio(serv3);
//*/
        
//crear tecnico
///*
        Tecnico tec1 = new Tecnico(10664642, "Juan", "Perez", "email", serv1);
///*
        Tecnico tec2 = new Tecnico(20369852, "Maria", "Alvarez", "whatsapp", serv1);
        Tecnico tec3 = new Tecnico(36521985, "Leoncio", "Gimenez", "email", serv2);
        Tecnico tec4 = new Tecnico(44444444, "Greta", "Lopez", "whatsapp", serv3);
        rrhh.crearTecnico(tec1);
        rrhh.crearTecnico(tec2);
        rrhh.crearTecnico(tec3);
        rrhh.crearTecnico(tec4);
//*/
      
//crear cliente
///*
        Cliente cli1 = new Cliente("24-12563985-4", "empresa1 sa", "empresa1@email.com", 1153698547);
///*
        ArrayList<Servicio> serviciosCli1 = new ArrayList();
        serviciosCli1.add(serv1);
        serviciosCli1.add(serv2);
        serviciosCli1.add(serv3);
        cli1.setServicios(serviciosCli1);
        ac.crearCliente(cli1);


        Cliente cli2 = new Cliente("27-52369874-4", "empresa2 sa", "empresa2@email.com", 1155555555);
        ArrayList<Servicio> serviciosCli2 = new ArrayList();
        serviciosCli2.add(serv1);
        serviciosCli2.add(serv3);
        cli2.setServicios(serviciosCli2);
        ac.crearCliente(cli2);
       
        Cliente cli3 = new Cliente("28-36985214-6", "empresa3 sa", "empresa3@email.com", 1122222222);
        ArrayList<Servicio> serviciosCli3 = new ArrayList();
        serviciosCli3.add(serv2);
        cli3.setServicios(serviciosCli3);
        ac.crearCliente(cli3);
       
        Cliente cli4 = new Cliente("29-12365478-8", "empresa4 sa", "empresa4@email.com", 1133333333);
        ArrayList<Servicio> serviciosCli4 = new ArrayList();
        serviciosCli4.add(serv1);
        serviciosCli4.add(serv2);
        cli4.setServicios(serviciosCli4);
        ac.crearCliente(cli4);
//*/       

//crear inciente
///*
        Incidente in1 = new Incidente("se rompio", new Date(), new Date(), false, cli1, serv1);
        in1.setTecnico(tec1);
        in1.setDificultad("ALTA");
        ma.crearIncidente(in1);
///*
        Incidente in2 = new Incidente("se rompio un poco", new Date(), new Date(), false, cli1, serv2);
        in2.setTecnico(tec3);
        in2.setDificultad("BAJA");
        ma.crearIncidente(in2);

        Incidente in3 = new Incidente("no prende", new Date(), new Date(), false, cli2, serv3);
        in3.setTecnico(tec4);
        in3.setDificultad("MEDIA");
        ma.crearIncidente(in3);
//*/
//************************************************************************************************
//bajas servicio -> eliminar servicio elimina incidentes y tecnicos asociados (pues cada tecnico tiene solo 1 servicio)
//        ac.eliminarServicio(1);

//bajas tecnico -> eliminar tecnicos elimina incidentes asociados
//        rrhh.eliminarTecnico(36521985);

//bajas cliente -> eliminar clientes elimina incidentes asociados
//        ac.eliminarCliente(cli1.getCuit());

//bajas incidente -> solo elimina incidentes
//        ma.eliminarIncidente(3);

//************************************************************************************************
/*
//actualizar y buscar servicio 
        Servicio serv = ac.buscarServicio(1);
        serv.setNombre("UBUNTU");
        ac.editarServicio(serv);

//actualizar y buscar tecnico 
        Tecnico tec = rrhh.buscarTecnico(tec1.getDNI());
        tec.setDispo(false);
        rrhh.editarTecnico(tec);

//actualizar y buscar cliente 
        Cliente cli = ac.buscarCliente(cli1.getCuit());
        cli.setRazonSocial("empresa1 inc");
        ac.editarCliente(cli);

//actualizar incidente 
        Incidente in = ma.buscarIncidente(1);
        in.setResuelto(true);
        ma.editarIncidente(in);
*/
//************************************************************************************************
        ArrayList <Cliente> listaCompleta = ac.listaCliente();
        System.out.println("********************");
        System.out.println("lista completa clientes");
        System.out.println("********************");
        for (Cliente cli: listaCompleta){
            System.out.println(cli.toString());
        }
}
}
