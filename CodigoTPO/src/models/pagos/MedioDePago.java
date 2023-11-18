package models.pagos;

import java.util.*;

/**
 * 
 */
public interface MedioDePago {

    /**
     * @param total 
     * @return
     */
    public abstract void abonarReserva(float total);

}