
import java.util.*;

/**
 * 
 */
public class AdapterTDebito implements AdapterMedioDePagoTDebito {

    /**
     * Default constructor
     */
    public AdapterTDebito() {
    }

    /**
     * @param nroTar 
     * @param total 
     * @return
     */
    public void abonarReserva(int nroTar, float total) {
        // TODO implement here
        return null;
    }

    /**
     * @param nroTar 
     * @param total 
     * @return
     */
    public abstract void abonarReserva(int nroTar, float total);

}