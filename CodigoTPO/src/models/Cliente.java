package models;

import models.comunicacion.MedioDeComunicacion;
import models.pagos.MedioDePago;
import models.habitacion.Habitacion;
import models.reserva.Reserva;

public class Cliente extends Usuario {
    private Reserva reserva;
    private MedioDeComunicacion medioDeComunicacion;
    private MedioDePago medioDePago;

    public Cliente(String nombre, String apellido, String dni, String mail, Reserva reserva, MedioDeComunicacion medioDeComunicacion, MedioDePago medioDePago) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.mail = mail;
        this.reserva = reserva;
        this.medioDeComunicacion = medioDeComunicacion;
        this.medioDePago = medioDePago;
    }

    public void reservarHabitacion(Habitacion habitacion) {
    }
    public void abonarReserva() {
    }

}