
package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.controllers.AreaComController;
import com.controllers.MesaAyudaController;
import com.controllers.RRHHController;
import com.models.Cliente;
import com.models.Incidente;
import com.models.Servicio;
import com.models.Tecnico;
import java.util.ArrayList;
import java.util.Date;


public class Tests {
    AreaComController ac = new AreaComController();
    RRHHController rrhh = new RRHHController();
    MesaAyudaController ma = new MesaAyudaController();

    Servicio serv1 = new Servicio("UBUNTU");
    Tecnico tec1 = new Tecnico(10664642, "Juan", "Perez", "email", serv1);
    Cliente cli1 = new Cliente("24-12563985-4", "empresa1 sa", "empresa1@email.com", 1153698547);
    Incidente in1 = new Incidente("se rompio", new Date(), new Date(), false, cli1, serv1);
  
    @Test
    public void testCrearServicio() {
        serv1.setNombre("LINUX");
        ac.crearServicio(serv1);
        int id = serv1.getId();
       
        Servicio servicioCreado = ac.buscarServicio(id);
        assertNotNull(servicioCreado);
        assertEquals(serv1.getId(), servicioCreado.getId());
        assertEquals(serv1.getNombre(), servicioCreado.getNombre());
        
        ac.eliminarServicio(id);
    }

    @Test
    public void testBuscarServicio() {
        serv1.setNombre("WINDOWS");
        ac.crearServicio(serv1);
        int id = serv1.getId();

        Servicio servicio = ac.buscarServicio(id);
        assertNotNull(servicio);
        assertEquals(id, servicio.getId());
        
        ac.eliminarServicio(id);
    }

    @Test
    public void testEditarServicio() {
        serv1.setNombre("TANGO");
        ac.crearServicio(serv1);
        int id = serv1.getId();
        
        Servicio servicio = ac.buscarServicio(id);
        assertNotNull(servicio);

        String nombreNuevo = "nombre editado";
        servicio.setNombre(nombreNuevo);
        ac.editarServicio(servicio);
        Servicio servicioEditado = ac.buscarServicio(id);

        assertNotNull(servicioEditado);
        assertEquals(nombreNuevo, servicioEditado.getNombre());
        
        ac.eliminarServicio(id);
    }

    @Test
    public void testBajaServicio() {
        serv1.setNombre("TANGO");
        ac.crearServicio(serv1);
        int id = serv1.getId();
        
        ac.eliminarServicio(id);
        Servicio servicioEliminado = ac.buscarServicio(id);
        assertNull(servicioEliminado);
    }

    
    @Test
    public void testCrearTecnico() {
        ac.crearServicio(serv1);
        rrhh.crearTecnico(tec1);
        int dni = tec1.getDNI();
       
        Tecnico tecnicoCreado = rrhh.buscarTecnico(dni);
        assertNotNull(tecnicoCreado);
        assertEquals(tec1.getDNI(), tecnicoCreado.getDNI());
        assertEquals(tec1.getNombre(), tecnicoCreado.getNombre());
        assertEquals(tec1.getApellido(), tecnicoCreado.getApellido());
        assertEquals(tec1.getNoti(), tecnicoCreado.getNoti());
        assertEquals(tec1.getServicio(), tecnicoCreado.getServicio());
        
    }
/*
    @Test
    public void testBuscarTecnico() {
        rrhh.crearTecnico(tec1);
        int dni = tec1.getDNI();

        Tecnico tecnico = rrhh.buscarTecnico(dni);
        assertNotNull(tecnico);
        assertEquals(dni, tecnico.getDNI());
        
        ac.eliminarServicio(dni);
    }

    @Test
    public void testEditarTecnico() {
        rrhh.crearTecnico(tec1);
        int dni = tec1.getDNI();
        
        Tecnico tecnico = rrhh.buscarTecnico(dni);
        assertNotNull(tecnico);

        String nombreNuevo = "nombre editado";
        tecnico.setNombre(nombreNuevo);
        rrhh.editarTecnico(tecnico);
        Tecnico tecnicoEditado = rrhh.buscarTecnico(dni);

        assertNotNull(tecnicoEditado);
        assertEquals(nombreNuevo, tecnicoEditado.getNombre());
        
        rrhh.eliminarTecnico(dni);
    }

    @Test
    public void testBajaTecnico() {
        rrhh.crearTecnico(tec1);
        int dni = tec1.getDNI();
        
        rrhh.eliminarTecnico(dni);
        Tecnico tecnicoEliminado = rrhh.buscarTecnico(dni);
        assertNull(tecnicoEliminado);
    }
    
    
    @Test
    public void testCreateCliente() {
        ac.crearCliente(cli1);
        String cuit = cli1.getCuit();
        
        Cliente clienteCreado = ac.buscarCliente(cuit);
        assertNotNull(clienteCreado);
        assertEquals(cli1.getCuit(), clienteCreado.getCuit());
        assertEquals(cli1.getRazonSocial(), clienteCreado.getRazonSocial());
        assertEquals(cli1.getEmail(), clienteCreado.getEmail());
        assertEquals(cli1.getTel(), clienteCreado.getTel());
        
        ac.eliminarCliente(cuit);
    }

    @Test
    public void testBuscarCliente() {
        ac.crearCliente(cli1);
        String cuit = cli1.getCuit();

        Cliente cliente = ac.buscarCliente(cuit);
        assertNotNull(cliente);
        assertEquals(cuit, cliente.getCuit());

        ac.eliminarCliente(cuit);
    }

    @Test
    public void testEditarCliente() {
        ac.crearCliente(cli1);
        String cuit = cli1.getCuit();

        Cliente cliente = ac.buscarCliente(cuit);
        assertNotNull(cliente);

        String nombreNuevo = "nombre editado";
        cliente.setRazonSocial(nombreNuevo);
        ac.editarCliente(cliente);
        Cliente clienteEditado = ac.buscarCliente(cuit);

        assertNotNull(clienteEditado);
        assertEquals(nombreNuevo, clienteEditado.getRazonSocial());
        
        ac.eliminarCliente(cuit);

    }

    @Test
    public void testBajaCliente() {
        ac.crearCliente(cli1);
        String cuit = cli1.getCuit();

        ac.eliminarCliente(cuit);
        Cliente clienteEliminado = ac.buscarCliente(cuit);
        assertNull(clienteEliminado);
    }
*/
}
