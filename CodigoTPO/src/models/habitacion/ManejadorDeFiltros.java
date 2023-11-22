package models.habitacion;

import java.util.List;

public class ManejadorDeFiltros {
    private FiltrosHabitacion primerFiltro;
    public ManejadorDeFiltros() {
        FiltrosHabitacion filtroExtras    = new FiltrarExtras(null);
        FiltrosHabitacion filtroHuespuedes = new FiltroCantidadHuespedes(filtroExtras);
        FiltrosHabitacion filtroTipoHab    = new FiltroTipoHabitacion(filtroHuespuedes);
        this.primerFiltro = filtroHuespuedes;
    }

    public List<Habitacion> filtrarHabitacion(int cantidad, TipoHabitacion tipo,List<Extra> extra,List<Habitacion> habitaciones){
        return primerFiltro.filtrarHabitacion(cantidad,tipo,extra,habitaciones);
    };

}