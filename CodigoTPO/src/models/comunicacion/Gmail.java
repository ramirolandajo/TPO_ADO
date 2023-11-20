package models.comunicacion;

import adapters.AdapterGmail;
import models.Observer;

public class Gmail implements MedioDeComunicacion, Observer {
    private AdapterGmail adapterGmail;

    public Gmail() {
        this.adapterGmail = new AdapterGmail();
    }

    @Override
    public void actualizar(String mensaje) {
        this.enviarMensaje(mensaje);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        adapterGmail.enviarMensaje(mensaje);
    }
}