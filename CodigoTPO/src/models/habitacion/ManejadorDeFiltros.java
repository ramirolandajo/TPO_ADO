package models.habitacion;

import java.util.ArrayList;
import java.util.List;

public class ManejadorDeFiltros {
    protected FiltrosHabitacion primerFiltro;
    public ManejadorDeFiltros(FiltrosHabitacion primerFiltro) {
        FiltrosHabitacion filtroTipoHab    = new FiltroTipoHabitacion(null);
        FiltrosHabitacion filtroExtras     = new FiltrarExtras(filtroTipoHab);
        FiltrosHabitacion filtroHuespuedes = new FiltroCantidadHuespedes(filtroExtras);
        this.primerFiltro = filtroHuespuedes;
    }

    //public List<Habitacion> filtrarHabitacion(int cantidad, String tipo, List<Habitacion> habitaciones,List<Extra> extras,List<Habitacion> habitacionesEncontradas);

}