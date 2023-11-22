package controllers;

import models.habitacion.*;

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
    public void crearHabitacion(String id,int personas,TipoHabitacion tipoHabitacion,float precio,List<Extra>extras){
        HabitacionBuilder h = new HabitacionBuilder(id,personas,tipoHabitacion,precio);

        for (Extra e:extras) {
            if(e instanceof ServicioInternet){
                h.asignarServicioInternet();
            }else if(e instanceof ServicioDespertador){
                h.asignarServicioDespertador();
            } else if (e instanceof  ServicioTv) {
                h.asignarServicioTv();
            } else if (e instanceof  ServicioMiniBar) {
                h.asignarServicioMinibar();
            }
        }

        listadoHabitaciones.add(h.getHabitacion());
    }

    public List<Habitacion> filtrarHabitaciones(int cantidad, TipoHabitacion tipo, List<Extra> extra){
        return manejadorDeFiltros.filtrarHabitacion(cantidad,tipo,extra,listadoHabitaciones);
    }
    public List<Habitacion> getListadoHabitaciones() {
        return listadoHabitaciones;
    }
    public  Habitacion getHabitacion(String id){
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