package models.comunicacion;

import models.Observer;
import models.reserva.Reserva;

import java.util.List;

public class SMS implements MedioDeComunicacion, Observer {
    private List<String> notificaciones;

    @Override
    public void actualizar(String mensaje, Reserva reserva) {
        enviarMensaje(mensaje);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Mensaje enviado a traves de SMS: " + mensaje);
        this.notificaciones.add(mensaje);
    }
}