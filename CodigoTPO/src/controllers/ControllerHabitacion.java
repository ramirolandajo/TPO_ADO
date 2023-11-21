package controllers;

import models.habitacion.Extra;
import models.habitacion.Habitacion;
import models.habitacion.ManejadorDeFiltros;
import models.habitacion.TipoHabitacion;

import java.util.*;

public class ControllerHabitacion {
    private List<Habitacion> listadoHabitaciones = new ArrayList<>();
    private ManejadorDeFiltros manejadorDeFiltros = new ManejadorDeFiltros();
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
    public List<Habitacion> filtrarHabitaciones(int cantidad, TipoHabitacion tipo, List<Extra> extra){
        return manejadorDeFiltros.filtrarHabitacion(cantidad,tipo,extra,listadoHabitaciones);
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