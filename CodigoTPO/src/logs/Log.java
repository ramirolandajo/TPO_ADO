package logs;

import models.Observer;

import java.io.File;
import java.io.FileWriter;
import java.util.*;


public class Log implements Observer {
    private List<Area> areas;

    public Log() {
        areas = new ArrayList<Area>();
        areas.add(new AreaContable());
        areas.add(new AreaMarketing());
    }
    @Override
    public void actualizar(String informacion) {
        escribirArchivo(informacion);
        enviarInformacion(informacion);
        System.out.println("Informacion logeada: " + informacion);
    }

    private void escribirArchivo(String informacion){
        try {
            File archivo = new File("Logs.txt");
            FileWriter Writer = new FileWriter("Logs.txt", true);
            Writer.write(informacion + "\n");
            Writer.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void enviarInformacion(String informacion) {
        for (Area area : areas) {
            area.procesarInformacion(informacion);
        }
    }

}