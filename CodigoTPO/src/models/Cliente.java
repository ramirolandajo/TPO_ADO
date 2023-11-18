package models;

import controllers.ControllerCliente;
import controllers.ControllerHabitacion;
import models.comunicacion.MedioDeComunicacion;
import models.pagos.MedioDePago;
import models.habitacion.Habitacion;
import models.reserva.Reserva;

public class Cliente extends Usuario {
    private Reserva reserva;
    private MedioDeComunicacion medioDeComunicacion;
    private MedioDePago medioDePago;

    public Cliente(String nombre, String apellido, String dni, String mail, MedioDeComunicacion medioDeComunicacion, MedioDePago medioDePago) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.mail = mail;
        this.medioDeComunicacion = medioDeComunicacion;
        this.medioDePago = medioDePago;
    }

    public void reservarHabitacion(Habitacion habitacion) {
        habitacion.actualizarEstado("reservada");//cambiar estado a boolean(?

    }
    public void abonarReserva() throws IllegalAccessException {
        float total = this.reserva.calcularTotal();
        this.medioDePago.abonarReserva(total);
    }

    public boolean soyEseCliente(String dni){
        return this.dni == dni;
    }
}