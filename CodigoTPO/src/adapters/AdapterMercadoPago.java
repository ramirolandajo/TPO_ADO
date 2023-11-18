
import java.util.*;

/**
 * 
 */
public class AdapterMercadoPago implements AdapterMedioDePagoMP {

    /**
     * Default constructor
     */
    public AdapterMercadoPago() {
    }

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