package logs;

import models.Observer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class Log implements Observer {

    private List<Area> areas;
    public Log(List<Area> areas) {
        this.areas = areas;
    }

//Observer observable,
    //@Override
    public void actualizar(Object informacion) {

            String info = (String) informacion;

            crearArchivo(info);
            enviarInformacion(info);
    }

    private void crearArchivo(String info){

        try{
            FileWriter log = new FileWriter("Log.txt");
            log.write(info);
            log.close();
        }catch(IOException e){
            e.printStackTrace();
        }


    }

    public void enviarInformacion(String informacion) {
        for (Area area : areas) {
            area.procesarInformacion(informacion);
        }
    }


    @Override
    public void actualizar(String mensaje) {
        enviarInformacion(mensaje);
    }
<<<<<<< HEAD
=======
    public void enviarInformacion(String informacion) {
        System.out.println(informacion);
    }
>>>>>>> 85ed1944338a684871d57119cb423fac9cabb0c7
}