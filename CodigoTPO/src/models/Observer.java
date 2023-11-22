package models;

import models.reserva.Reserva;

public interface Observer {
    void actualizar(String mensaje, Reserva reserva);
}