package logs;

import adapters.AdapterSistemaContable;

public class AreaContable extends Area {

    private AdapterSistemaContable adapterSistemaContable;

    public AreaContable() {
        this.adapterSistemaContable = new AdapterSistemaContable();
    }

    public void procesarInformacion(String informacion) {
        adapterSistemaContable.procesarInformacion(informacion);
    }

}