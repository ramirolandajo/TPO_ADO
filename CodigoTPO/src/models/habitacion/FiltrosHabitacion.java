package models.habitacion;

import java.util.ArrayList;
import java.util.List;


public abstract class FiltrosHabitacion {

    protected FiltrosHabitacion siguienteFiltro;
    protected List<Habitacion> encontradas;
    public FiltrosHabitacion(FiltrosHabitacion siguienteFiltro) {
        this.encontradas = new ArrayList<>();
        this.siguienteFiltro = siguienteFiltro;
    }

    public abstract List<Habitacion> filtrarHabitacion(int cantidad, TipoHabitacion tipo,List<Extra> extra, List<Habitacion> habitaciones );
}