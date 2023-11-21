package models.habitacion;

import java.util.ArrayList;
import java.util.List;


public abstract class FiltrosHabitacion {

    protected FiltrosHabitacion siguienteFiltro;
    protected List<Habitacion> encontradas = new ArrayList<>();
    public FiltrosHabitacion(FiltrosHabitacion siguienteFiltro) {
        this.siguienteFiltro = siguienteFiltro;
    }

    public abstract List<Habitacion> filtrarHabitacion(int cantidad, TipoHabitacion tipo,List<Extra> extra, List<Habitacion> habitaciones );
}