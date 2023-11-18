package models.pagos;

import java.util.*;

/**
 * 
 */
public abstract class Tarjeta implements MedioDePago {

    /**
     * Default constructor
     */
    public Tarjeta() {
    }

    /**
     * 
     */
    private String titular;

    /**
     * 
     */
    private int numero;

    /**
     * 
     */
    private int codigoSeguridad;

    /**
     * 
     */
    private Date vencimiento;

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