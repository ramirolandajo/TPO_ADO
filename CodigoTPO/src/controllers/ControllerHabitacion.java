package controllers;

import models.habitacion.Habitacion;

import java.util.*;

public class ControllerHabitacion {
    private List<Habitacion> listadoHabitaciones = new ArrayList<>();

    private static ControllerHabitacion instancia;
    public ControllerHabitacion() {
        
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