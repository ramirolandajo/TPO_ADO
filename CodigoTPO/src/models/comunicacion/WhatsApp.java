package models.comunicacion;

import adapters.AdapterWhatsApp;
import models.Observer;

public class WhatsApp implements MedioDeComunicacion, Observer {

    private AdapterWhatsApp adapterWhatsApp;

    public WhatsApp() {
        this.adapterWhatsApp = new AdapterWhatsApp();
    }

    @Override
    public void actualizar(String mensaje) {
        this.enviarMensaje(mensaje);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        adapterWhatsApp.enviarMensaje(mensaje);
    }
}