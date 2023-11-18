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
import java.util.List;

public class ControllerCliente {

    private List<Cliente> listadoClientes = new ArrayList<>();

    private static ControllerCliente instancia;

    private ControllerCliente() {
         Cliente Cliente1 = new Cliente("Sebastian","Bernasconi","11222333",
                 "bernaseba1@gmail.com",new Gmail(),new MercadoPago());

         Cliente Cliente2 = new Cliente("Ramiro","Landajo","22333444",
                    "ramalandajo@gmail.com",new Gmail(),new TCredito("Ramiro Landajo",
                 11223344,234, LocalDate.now(),200000));

         Cliente Cliente3 = new Cliente("Mateo","Rosello","33444555",
                 "mateorosello@gmail.com",new Gmail(),new TDebito(new AdapterTDebito(),"Mateo Rosello",
                 22334455,754,LocalDate.of(2027,10,04),100000));

        Cliente Cliente4 = new Cliente("Valentin","Quiroga","44555666",
                "valenquiroga@gmail.com",new Gmail(),new MercadoPago());

        Cliente Cliente5 = new Cliente("Matias","Marano","55666777",
                "matimarano@gmail.com",new Gmail(),new Efectivo());

        Cliente Cliente6 = new Cliente("Ramiro","Landajo","66777888",
                "ramalandajo@gmail.com",new Gmail(),new MercadoPago());

        Cliente Cliente7 = new Cliente("Ivo","Bandoni","77888999",
                "ivobandoni@gmail.com",new Gmail(),new Efectivo());

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
        if (cABuscar != null){
            Cliente c = new Cliente(nombre,apellido,dni,mail, new Gmail(), null);
            listadoClientes.add(c);
        }else {
            //deberia haber una excepcion...
            System.out.println("Ya existe un cliente con ese nro de documento");
        }

    }
    public void ReservarHabitacion(String dni, String idHabitacion){
        ControllerHabitacion controllerHabitacion = ControllerHabitacion.getInstancia();
        ControllerReserva controllerReserva = ControllerReserva.getInstancia();

        Cliente c = BuscarCliente(dni);

        Habitacion h = controllerHabitacion.BuscarHabitacion(idHabitacion);//xd?
        if(h != null && c != null){
            c.reservarHabitacion(h);
        }
        //controllerReserva.CrearReserva(params);

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
