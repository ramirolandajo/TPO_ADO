package models;

import models.comunicacion.MedioDeComunicacion;
import models.pagos.MedioDePago;
import models.habitacion.Habitacion;
import models.reserva.Reserva;

public class Cliente extends Usuario {

    public Cliente() {
    }

    private Reserva reserva;
    private MedioDeComunicacion medioDeComunicacion;
    private MedioDePago medioDePago;

    public void reservarHabitacion(Habitacion habitacion) {
    }
    public void abonarReserva() {
    }

}