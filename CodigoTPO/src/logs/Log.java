package logs;

import models.Observer;
import models.reserva.Reserva;

import java.io.File;
import java.io.FileWriter;
import java.util.*;


public class Log implements Observer {
    private List<Area> areas;

    public Log() {
        areas = new ArrayList<>();
        areas.add(new AreaContable());
        areas.add(new AreaMarketing());
    }
    @Override
    public void actualizar(String informacion, Reserva reserva) {
        escribirArchivo(informacion, reserva);
        enviarInformacion(informacion, reserva);
        System.out.println("Informacion logeada: " + informacion);
    }

    private void escribirArchivo(String informacion, Reserva reserva){
        try {
            File archivo = new File("Logs.txt");
            FileWriter Writer = new FileWriter("Logs.txt", true);
            Writer.write(informacion + " id de la reserva: " + reserva.getIdReserva() + "\n");
            Writer.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void enviarInformacion(String informacion, Reserva reserva) {
        for (Area area : areas) {
            area.procesarInformacion(informacion);
            if (area instanceof AreaMarketing) {
                ((AreaMarketing) area).elaborarPerfil(reserva);
            }
        }
    }

}