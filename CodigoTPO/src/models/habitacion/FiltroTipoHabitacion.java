package models.habitacion;

import java.util.List;

public class FiltroTipoHabitacion extends FiltrosHabitacion {
    public FiltroTipoHabitacion(FiltrosHabitacion siguienteFiltro) {
        super(siguienteFiltro);
    }

    @Override
    public boolean filtrarHabitacion(int cantidad, TipoHabitacion tipo, Extra extra, Habitacion habitacion) {
        if(tipo!=null)
            return tipo==habitacion.getTipo();
        else
            return this.siguienteFiltro.filtrarHabitacion(cantidad,tipo,extra,habitacion);
    }

}