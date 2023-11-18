
import java.util.*;

/**
 * 
 */
public class AdapterTransferencia implements AdapterMedioDePagoTrasnferencia {

    /**
     * Default constructor
     */
    public AdapterTransferencia() {
    }

    /**
     * @param cuentaCliente 
     * @param cuentaHotel 
     * @param total 
     * @return
     */
    public void abonarReserva(string cuentaCliente, String cuentaHotel, float total) {
        // TODO implement here
        return null;
    }

    /**
     * @param cuentaCliente 
     * @param cuentaHotel 
     * @param total 
     * @return
     */
    public abstract void abonarReserva(string cuentaCliente, String cuentaHotel, float total);

}