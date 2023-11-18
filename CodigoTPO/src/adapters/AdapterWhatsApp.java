package adapters;

import adapters.interfaces.AdapterMedioComunicacion;

public class AdapterWhatsApp implements AdapterMedioComunicacion {

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Mensaje enviado a traves de whatsapp: " + mensaje);
    }
}