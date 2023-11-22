package Test;

import controllers.ControllerCliente;
import controllers.ControllerHabitacion;
import controllers.ControllerReserva;
import models.Cliente;
import models.habitacion.*;
import models.reserva.Reserva;
import models.reserva.TipoFactura;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
        System.out.println("Fecha ingreso -> " + r.getFechaIngreso());
        System.out.println("Fecha salida -> " + r.getFechaSalida());
        System.out.println("Total -> " + r.getTotal());
        System.out.println("Estado -> " +  r.getEstadoReserva());
    }
    public static void MostrarHabitacon(Habitacion h){
        System.out.println("id -> " + h.getId());
        System.out.println("personas -> " + h.getPersonas());
        System.out.println("Tipo -> " + h.getTipo());
        System.out.println("Estado -> " + h.getEstado());
        System.out.println("Precio -> " + h.getPrecio());
        h.MostrarExtras();
    }
    public static void main(String[] args) throws IllegalAccessException {
        Scanner sc = new Scanner(System.in);

        //generando instancias de los controllers
        ControllerCliente controllerCliente = ControllerCliente.getInstancia();
        ControllerReserva controllerReserva = ControllerReserva.getInstancia();
        ControllerHabitacion controllerHabitacion = ControllerHabitacion.getInstancia();

        //Iniciando Test Habitacion
        List<Extra> serviciosHabitacion1 = new ArrayList<>();
        ServicioInternet servicioInternet = new ServicioInternet();
        ServicioDespertador servicioDespertador = new ServicioDespertador();
        ServicioTv servicioTv = new ServicioTv();
        ServicioMiniBar servicioMiniBar = new ServicioMiniBar();

        serviciosHabitacion1.add(servicioInternet);

        List<Extra> serviciosHabitacion2 = new ArrayList<>();
        serviciosHabitacion2.add(servicioDespertador);
        serviciosHabitacion2.add(servicioInternet);
        serviciosHabitacion2.add(servicioTv);

        controllerHabitacion.crearHabitacion("H1",3,TipoHabitacion.HABITACION,200,serviciosHabitacion1);
        controllerHabitacion.crearHabitacion("H2",5,TipoHabitacion.HABITACION,200,serviciosHabitacion2);
        MostrarHabitacon(controllerHabitacion.getHabitacion("H1"));
        MostrarHabitacon(controllerHabitacion.getHabitacion("H2"));

        //Iniciando Test Filtros
        List<Extra> extrasFiltro = new ArrayList<>();
        extrasFiltro.add(servicioDespertador);
        extrasFiltro.add(servicioInternet);
        extrasFiltro.add(servicioTv);
        for (Habitacion h: controllerHabitacion.getListadoHabitaciones()) {
            System.out.println(h.getId());
        }

        List<Habitacion> habitacionesFiltradas = controllerHabitacion.filtrarHabitaciones(5, TipoHabitacion.HABITACION,extrasFiltro);

        System.out.println("Habitaciones que cumplen con el filtro");
        for (Habitacion h :
                habitacionesFiltradas) {
            MostrarHabitacon(h);
        }
        sc.nextLine();

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
        /*
        * Para que haga descuento: fecha inicio <= LocalDate.of(2023,11,24)
        * Para que no haga descuento: fecha inicio = LocalDate.of(2023,12,24)
        * Para que cobre recargo: fecha inicio >= LocalDate.of(2024,4,24)*/
        controllerCliente.ReservarHabitacion(cABuscar.obtenerDni(),"H1",
                LocalDate.now(),LocalDate.of(2023,11,24),
                LocalDate.of(2024,1,5));
        //Imprimiendo la reserva
        MostrarReserva(controllerReserva.getReserva(1));
        sc.nextLine();

        //Pagando reserva y actualizando el estado la reserva
        controllerCliente.AbonarReserva("11222333");
        MostrarReserva(controllerReserva.getReserva(1));
        sc.nextLine();
        //fin test cliente

        //inicio test Reserva
        //solo queda esto por probar, el resto de los metodos se usan en conjunto con la clase cliente
        controllerReserva.GenerarFactura(TipoFactura.A,1);
        sc.nextLine();




    System.out.println("-------------------------------------Fin del programa-------------------------------------");

    }
}
