package Test;

import controllers.ControllerCliente;
import controllers.ControllerHabitacion;
import controllers.ControllerReserva;
import models.Cliente;
public class Test {

    public static void MostrarCliente(Cliente c){
        System.out.println("DNI -> "+ c.getDni());
        System.out.println("Nombre -> "+c.getNombre());
        System.out.println("Apellido -> " + c.getApellido());
        System.out.println("Mail -> "+ c.getMail());
        System.out.println("Medio de pago -> "+ c.getMedioDePago());
        System.out.println("Reserva -> " + c.getReserva());
    }
    public static void main(String[] args) {
        //generando instancias de los controllers
        ControllerCliente controllerCliente = ControllerCliente.getInstancia();
        ControllerReserva controllerReserva = ControllerReserva.getInstancia();
        ControllerHabitacion controllerHabitacion = ControllerHabitacion.getInstancia();

        //Test de los metodos del cliente
        controllerCliente.RegistrarCliente("Sebastian","Bernasconi",
                "11222333","bernaseba1@gmail.com");
        controllerCliente.RegistrarCliente("Ramiro","Landajo",
                "22333444","ramirolandajo@gmail.com");

        Cliente cABuscar = controllerCliente.getCliente("11222333");
        MostrarCliente(cABuscar);


    }
}
