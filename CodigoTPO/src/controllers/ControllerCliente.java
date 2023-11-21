package controllers;

import adapters.AdapterTDebito;
import models.Cliente;
import models.comunicacion.Gmail;
import models.habitacion.Habitacion;
import models.pagos.Efectivo;
import models.pagos.MercadoPago;
import models.pagos.TCredito;
import models.pagos.TDebito;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ControllerCliente {

    private List<Cliente> listadoClientes;

    private static ControllerCliente instancia;

    private ControllerCliente() {
        this.listadoClientes = new ArrayList<>();
    }

    public static ControllerCliente getInstancia() {
        if(instancia == null){
            return instancia =new ControllerCliente();
        }else {
            return instancia;
        }
    }

    public void RegistrarCliente(String nombre, String apellido, String dni,
                                 String mail){
        Cliente cABuscar = BuscarCliente(dni);
        if (cABuscar == null){
            Cliente c = new Cliente(nombre,apellido,dni,mail, new Gmail(), new MercadoPago());
            listadoClientes.add(c);
            System.out.println("Cliente con dni: " + dni + " registrado con exito!");
        }else {
            //deberia haber una excepcion...
            System.out.println("Ya existe un cliente con ese nro de documento");
        }

    }
    public void ReservarHabitacion(String dni, String idHabitacion,LocalDate fechaRealizacion
            , LocalDate fehcaIngreso, LocalDate fechaSalida){
        ControllerHabitacion controllerHabitacion = ControllerHabitacion.getInstancia();
        ControllerReserva controllerReserva = ControllerReserva.getInstancia();

        Cliente c = BuscarCliente(dni);

        Habitacion h = controllerHabitacion.BuscarHabitacion(idHabitacion);
        if(h != null && c != null){
            c.reservarHabitacion(h);
        }
        controllerReserva.CrearReserva(h,c,fechaRealizacion,fehcaIngreso,fechaSalida);

    }
    public void AbonarReserva(String dni) throws IllegalAccessException {
        Cliente c = BuscarCliente(dni);
        if (c != null){
            c.abonarReserva();
        }else {
            System.out.println("El cliente con dni " + dni + " " +
                    "no se encuentra registrado");
        }
    }
    public Cliente getCliente(String dni){
        Cliente c = BuscarCliente(dni);

        return c;
    }

    private Cliente BuscarCliente(String dni){
        for (Cliente c :
                listadoClientes) {
            if(c.soyEseCliente(dni)){
                return c;
            }
        }
        return null;
    }
}
