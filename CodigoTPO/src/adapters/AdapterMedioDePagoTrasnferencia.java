
import java.util.*;

/**
 * 
 */
public interface AdapterMedioDePagoTrasnferencia {

    /**
     * @param cuentaCliente 
     * @param cuentaHotel 
     * @param total 
     * @return
     */
    public abstract void abonarReserva(string cuentaCliente, String cuentaHotel, float total);

}