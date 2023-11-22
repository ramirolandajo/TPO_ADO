package models.habitacion;

import java.util.List;

public class FiltrarExtras extends FiltrosHabitacion{

    public FiltrarExtras(FiltrosHabitacion siguienteFiltro) {
        super(siguienteFiltro);
    }

    @Override
    public List<Habitacion> filtrarHabitacion(int cantidad, TipoHabitacion tipo, List<Extra> extra, List<Habitacion> habitaciones) {
        if(!extra.isEmpty()){
            for (Habitacion h: habitaciones) {
                boolean filtroExtras = true;
                for(Extra e : extra){
                    if(!h.getExtras().contains(e))
                        filtroExtras = false;
                    System.out.println("extras");
                }
                if(filtroExtras)
                    encontradas.add(h);
            }
        }
        if(siguienteFiltro!=null)
            return this.siguienteFiltro.filtrarHabitacion(cantidad,tipo,extra,encontradas);
        else
            return encontradas;

    }

}
