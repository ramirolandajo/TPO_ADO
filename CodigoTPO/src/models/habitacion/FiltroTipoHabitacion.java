package models.habitacion;

import java.util.List;

public class FiltroTipoHabitacion extends FiltrosHabitacion {
    public FiltroTipoHabitacion(FiltrosHabitacion siguienteFiltro) {
        super(siguienteFiltro);
    }

    @Override
    public List<Habitacion> filtrarHabitacion(int cantidad, TipoHabitacion tipo, List<Extra> extra, List<Habitacion> habitaciones) {
        if(tipo!=null){
            for (Habitacion h:habitaciones) {
                if(h.getTipo()==tipo){
                    encontradas.add(h);
                    System.out.println("Habitacion agregada a filtro de tipo de habitacion");
                }
            }
        }
        if(siguienteFiltro!=null)
            return this.siguienteFiltro.filtrarHabitacion(cantidad,tipo,extra,encontradas);
        else
            return encontradas;
    }
}