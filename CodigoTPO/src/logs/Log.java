package logs;

import models.Observer;

import java.util.*;

public class Log implements Observer {

    public Log() {
    }
    private List<Area> areas;

    @Override
    public void actualizar(String mensaje) {
        enviarInformacion(mensaje);
    }
    public void enviarInformacion(String informacion) {
        System.out.println(informacion);
    }
}