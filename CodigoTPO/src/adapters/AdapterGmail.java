package adapters;

import adapters.interfaces.AdapterMedioComunicacion;

public class AdapterGmail implements AdapterMedioComunicacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Mensaje enviado por gmail: " + mensaje);
    }
}