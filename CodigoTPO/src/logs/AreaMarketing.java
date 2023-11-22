package logs;

import adapters.AdapterSistemaMarketing;
import models.reserva.Reserva;

public class AreaMarketing extends Area {
    private AdapterSistemaMarketing adapterSistemaMarketing;

    public AreaMarketing(){
        this.adapterSistemaMarketing = new AdapterSistemaMarketing();
    }
    @Override
    public void procesarInformacion(String informacion) {
        adapterSistemaMarketing.procesarInformacion(informacion);
    }

    public void elaborarPerfil(Reserva reserva){
        adapterSistemaMarketing.elaborarPerfil(reserva);
    }
}