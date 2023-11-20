package models.habitacion;

import java.util.List;
public class FiltroCantidadHuespedes extends FiltrosHabitacion {
    public FiltroCantidadHuespedes(FiltrosHabitacion siguienteFiltro) {
        super(siguienteFiltro);
    }

    @Override
    public boolean filtrarHabitacion(int cantidad, TipoHabitacion tipo, Extra extra, Habitacion habitacion) {
        if(cantidad>0){
            return habitacion.getPersonas()==cantidad;
        }else
            return this.siguienteFiltro.filtrarHabitacion(cantidad,tipo,extra,habitacion);
    }

}