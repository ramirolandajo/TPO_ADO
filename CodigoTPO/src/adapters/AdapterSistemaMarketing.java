package adapters;

import adapters.interfaces.AdapterSistemaArea;
import models.reserva.Reserva;

public class AdapterSistemaMarketing implements AdapterSistemaArea {
    @Override
    public void procesarInformacion(String informacion) {
        System.out.println("Informacion procesada por el area de marketing: " + informacion);
    }

    public void elaborarPerfil(Reserva reserva) {
        System.out.println("Se elaboro un perfil para el cliente con dni: " + reserva.getCliente().obtenerDni());
    }
}