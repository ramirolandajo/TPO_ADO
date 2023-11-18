
import java.util.*;

/**
 * 
 */
public class Reserva extends Sujeto {

    /**
     * Default constructor
     */
    public Reserva() {
    }

    /**
     * 
     */
    private String idReserva;

    /**
     * 
     */
    private Habitacion habitacion;

    /**
     * 
     */
    private Cliente cliente;

    /**
     * 
     */
    private Date fechaRealizacion;

    /**
     * 
     */
    private Date fechaIngreso;

    /**
     * 
     */
    private Date fechaSalida;

    /**
     * 
     */
    private float total;

    /**
     * 
     */
    private MedioDePago medioDePago;

    /**
     * 
     */
    private List<Observer> observers;

    /**
     * 
     */
    private boolean pagada;

    /**
     * @return
     */
    public void notificar() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void agregarObservador() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void quitarObservador() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void generarFactura() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void actualizarEstado() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public float calcularTotal() {
        // TODO implement here
        return 0.0f;
    }

    /**
     * @return
     */
    public float calcularDescuento() {
        // TODO implement here
        return 0.0f;
    }

}