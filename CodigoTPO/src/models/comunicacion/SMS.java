package models.comunicacion;

import models.Observer;

public class SMS implements MedioDeComunicacion, Observer {
    @Override
    public void actualizar() {

    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Mensaje enviado a traves de SMS: " + mensaje);
    }
}