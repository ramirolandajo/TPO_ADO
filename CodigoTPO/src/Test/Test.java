package Test;

import controllers.ControllerCliente;
import controllers.ControllerHabitacion;
import controllers.ControllerReserva;
import models.Cliente;
import models.reserva.Reserva;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {

    public static void MostrarCliente(Cliente c){
        System.out.println("DNI -> "+ c.getDni());
        System.out.println("Nombre -> "+c.getNombre());
        System.out.println("Apellido -> " + c.getApellido());
        System.out.println("Mail -> "+ c.getMail());
        System.out.println("Medio de pago -> "+ c.getMedioDePago());
        System.out.println("Reserva -> " + c.getReserva());
    }

    public static void MostrarReserva(Reserva r){
        System.out.println("id ->"  + r.getIdReserva());
        System.out.println("Habitacion ->" + r.getHabitacion().getId());
        System.out.println("Cliente -> " + r.getCliente().getDni());
        System.out.println("Fecha realizacion -> " + r.getFechaRealizacion());
        System.out.println("Fecha ingreso ->" + r.getFechaIngreso());
        System.out.println("Fecha salida ->" + r.getFechaSalida());
        System.out.println("Total ->" + r.getTotal());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //generando instancias de los controllers
        ControllerCliente controllerCliente = ControllerCliente.getInstancia();
        ControllerReserva controllerReserva = ControllerReserva.getInstancia();
        ControllerHabitacion controllerHabitacion = ControllerHabitacion.getInstancia();

        //Test de los metodos del cliente

        //Registrando clientes
        controllerCliente.RegistrarCliente("Sebastian","Bernasconi",
                "11222333","bernaseba1@gmail.com");
        sc.nextLine();

        controllerCliente.RegistrarCliente("Ramiro","Landajo",
                "22333444","ramirolandajo@gmail.com");
        sc.nextLine();

        //imprimiendo cliente
        Cliente cABuscar = controllerCliente.getCliente("11222333");
        MostrarCliente(cABuscar);
        sc.nextLine();

        //Haciendo reserva
        controllerCliente.ReservarHabitacion(cABuscar.obtenerDni(),"H1",
                LocalDate.now(),LocalDate.of(2023,12,23),
                LocalDate.of(2024,1,5));
        MostrarReserva(controllerReserva.getReserva(1));
        sc.nextLine();



    }
}
