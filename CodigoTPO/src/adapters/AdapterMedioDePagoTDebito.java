package adapters;

import java.util.*;

/**
 * 
 */
public interface AdapterMedioDePagoTDebito {

    /**
     * @param nroTar 
     * @param total 
     * @return
     */
    public abstract void abonarReserva(int nroTar, float total);

}