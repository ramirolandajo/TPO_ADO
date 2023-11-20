package models.habitacion;

import java.util.List;


public abstract class FiltrosHabitacion {

    protected FiltrosHabitacion siguienteFiltro;

    public FiltrosHabitacion(FiltrosHabitacion siguienteFiltro) {
        this.siguienteFiltro = siguienteFiltro;
    }

    public abstract boolean filtrarHabitacion(int cantidad, TipoHabitacion tipo, Extra extra,Habitacion habitacion );

}