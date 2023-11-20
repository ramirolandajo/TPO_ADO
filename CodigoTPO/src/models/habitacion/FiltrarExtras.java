package models.habitacion;

public class FiltrarExtras extends FiltrosHabitacion{

    public FiltrarExtras(FiltrosHabitacion siguienteFiltro) {
        super(siguienteFiltro);
    }

    @Override
    public boolean filtrarHabitacion(int cantidad, TipoHabitacion tipo, Extra extra, Habitacion habitacion) {
        if(extra!=null)
            return tipo==habitacion.getTipo();
        else
            return this.siguienteFiltro.filtrarHabitacion(cantidad,tipo,extra,habitacion);
    }

}
