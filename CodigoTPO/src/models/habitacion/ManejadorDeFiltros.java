package models.habitacion;

import controllers.ControllerHabitacion;

import java.util.ArrayList;
import java.util.List;

public class ManejadorDeFiltros {
    private FiltrosHabitacion primerFiltro;
    private ControllerHabitacion controllerHabitacion = ControllerHabitacion.getInstancia();
    public ManejadorDeFiltros(FiltrosHabitacion primerFiltro) {
        FiltrosHabitacion filtroExtras    = new FiltrarExtras(null);
        FiltrosHabitacion filtroHuespuedes = new FiltroCantidadHuespedes(filtroExtras);
        FiltrosHabitacion filtroTipoHab    = new FiltroTipoHabitacion(filtroHuespuedes);
        this.primerFiltro = filtroHuespuedes;
    }

    public List<Habitacion> filtrarHabitacion(int cantidad, TipoHabitacion tipo,List<Extra> extra){
        return primerFiltro.filtrarHabitacion(cantidad,tipo,extra,controllerHabitacion.getListadoHabitaciones());
    };

}