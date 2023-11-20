package models.habitacion;

import controllers.ControllerHabitacion;

import java.util.ArrayList;
import java.util.List;

public class ManejadorDeFiltros {
    private FiltrosHabitacion primerFiltro;
    private List<Habitacion> encontradas = new ArrayList<>();
    private ControllerHabitacion controllerHabitacion = ControllerHabitacion.getInstancia();
    public ManejadorDeFiltros(FiltrosHabitacion primerFiltro) {
        FiltrosHabitacion filtroTipoHab    = new FiltroTipoHabitacion(null);
        FiltrosHabitacion filtroExtras     = new FiltrarExtras(filtroTipoHab);
        FiltrosHabitacion filtroHuespuedes = new FiltroCantidadHuespedes(filtroExtras);
        this.primerFiltro = filtroHuespuedes;
    }

    public List<Habitacion> filtrarHabitacion(int cantidad, TipoHabitacion tipo,Extra extra, List<Habitacion> habitaciones){
        for (Habitacion h: controllerHabitacion.getListadoHabitaciones()) {
            if(this.primerFiltro.siguienteFiltro.filtrarHabitacion(cantidad,tipo,extra,h))
                encontradas.add(h);
        }
        return encontradas;
    };

}