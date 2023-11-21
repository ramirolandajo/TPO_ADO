package models.habitacion;

import java.util.List;
public class FiltroCantidadHuespedes extends FiltrosHabitacion {
    public FiltroCantidadHuespedes(FiltrosHabitacion siguienteFiltro) {
        super(siguienteFiltro);
    }

    @Override
    public List<Habitacion> filtrarHabitacion(int cantidad, TipoHabitacion tipo, List<Extra> extra, List<Habitacion> habitaciones) {
        if(cantidad>0){
            for (Habitacion h:habitaciones) {
                if(cantidad>=h.getPersonas())
                    encontradas.add(h);
            }
        }
        if(siguienteFiltro!=null)
            return this.siguienteFiltro.filtrarHabitacion(cantidad,tipo,extra,encontradas);
        else
            return encontradas;
    }

}