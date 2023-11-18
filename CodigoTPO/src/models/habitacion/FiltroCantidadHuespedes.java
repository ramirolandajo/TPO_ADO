package models.habitacion;

/**
 * 
 */
public class FiltroCantidadHuespedes extends FiltrosHabitacion {

    /**
     * Default constructor
     */
    public FiltroCantidadHuespedes() {
    }

    /**
     * @param cantidad 
     * @param tipo 
     * @return
     */
    public Habitacion filtrarHabitacion(int cantidad, String tipo) {
        // TODO implement here
        return null;
    }

    /**
     * @param cantidad 
     * @param tipo 
     * @return
     */
    public abstract Habitacion filtrarHabitacion(int cantidad, String tipo);

}