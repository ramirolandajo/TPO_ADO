package controllers;

import models.habitacion.Habitacion;
import models.habitacion.HabitacionBuilder;
import models.habitacion.TipoHabitacion;

import java.util.*;

public class ControllerHabitacion {
    private List<Habitacion> listadoHabitaciones = new ArrayList<>();

    private static ControllerHabitacion instancia;
    public ControllerHabitacion() {
        Habitacion h = new HabitacionBuilder("H1",3, TipoHabitacion.HABITACION,200)
                .asignarServicioInternet().getHabitacion();
        listadoHabitaciones.add(h);
    }
    public static  ControllerHabitacion getInstancia(){
        if (instancia == null){
            return instancia = new ControllerHabitacion();
        }else {
            return instancia;
        }
    }
    public List<Habitacion> getListadoHabitaciones() {
        return listadoHabitaciones;
    }

    public Habitacion getHabitacion(String id){
        Habitacion h = BuscarHabitacion(id);
        return h;
    }
    Habitacion BuscarHabitacion(String id){
        for (Habitacion h :
                listadoHabitaciones) {
            if (h.soyEsaHabitacion(id)) {
                return h;
            }
        }
        return null;
    }

}