package adapters;

import adapters.interfaces.AdapterSistemaArea;

public class AdapterSistemaContable implements AdapterSistemaArea {

    @Override
    public void procesarInformacion(String informacion) {
        System.out.println("Informacion procesada por el area de contaduria: " + informacion);
    }

}