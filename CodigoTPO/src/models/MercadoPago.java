
import java.util.*;

/**
 * 
 */
public class MercadoPago implements MedioDePago {

    /**
     * Default constructor
     */
    public MercadoPago() {
    }

    /**
     * 
     */
    private String usuario;

    /**
     * 
     */
    private float saldo;

    /**
     * @param total 
     * @return
     */
    public void abonarReserva(float total) {
        // TODO implement here
        return null;
    }

    /**
     * @param total 
     * @return
     */
    public abstract void abonarReserva(float total);

}