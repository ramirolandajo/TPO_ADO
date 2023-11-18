package adapters;

/**
 * 
 */
public class AdapterTCredito implements AdapterMedioDePagoTCredito {

    /**
     * Default constructor
     */
    public AdapterTCredito() {
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