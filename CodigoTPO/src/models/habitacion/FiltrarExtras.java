package models.habitacion;

import java.util.List;

public class FiltrarExtras extends FiltrosHabitacion {

    public FiltrarExtras(FiltrosHabitacion siguienteFiltro) {
        super(siguienteFiltro);
    }

    @Override
    public List<Habitacion> filtrarHabitacion(int cantidad, TipoHabitacion tipo, List<Extra> extra, List<Habitacion> habitaciones) {
        if (!extra.isEmpty()) {

            for (Habitacion h : habitaciones) {
                boolean cumpleFiltros = true;

                for (Extra extraFiltrar : extra) {
                    List<Extra> extrasDeHabitacion = h.getExtras();
                    boolean coincideConExtra = false;
                    for (Extra extraHabitacion : extrasDeHabitacion) {
                        if (extraFiltrar.getClass().equals(extraHabitacion.getClass())) {
                            coincideConExtra = true;
                        }
                    }
                    if (!coincideConExtra) {
                        cumpleFiltros = false;
                    }
                }
                if (cumpleFiltros) {
                    encontradas.add(h);
                    System.out.println("Habitacion agregada a filtro de extras");
                }
            }
        }
        if(siguienteFiltro!=null)
            return this.siguienteFiltro.filtrarHabitacion(cantidad,tipo,extra,encontradas);
        else
            return encontradas;
    }
}
