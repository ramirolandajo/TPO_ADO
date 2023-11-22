package models.comunicacion;

import adapters.AdapterGmail;
import models.Observer;
import models.reserva.Reserva;

public class Gmail implements MedioDeComunicacion,Observer{
    private AdapterGmail adapterGmail;

    public Gmail() {
        this.adapterGmail = new AdapterGmail();
    }
    @Override
    public void actualizar(String mensaje, Reserva reserva) {
        this.enviarMensaje(mensaje);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        adapterGmail.enviarMensaje(mensaje);
    }
}