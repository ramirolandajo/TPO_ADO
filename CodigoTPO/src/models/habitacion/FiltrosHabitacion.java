package models.habitacion;

/**
 * 
 */
public abstract class FiltrosHabitacion {

    /**
     * Default constructor
     */
    public FiltrosHabitacion() {
    }

    /**
     * @param cantidad 
     * @param tipo 
     * @return
     */
    public abstract Habitacion filtrarHabitacion(int cantidad, String tipo);

}