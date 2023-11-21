package models.pagos;

import adapters.AdapterMercadoPago;

public class MercadoPago implements MedioDePago {
    AdapterMercadoPago adapterMercadoPago;

    public MercadoPago(){
        this.adapterMercadoPago = new AdapterMercadoPago("Sebastian",1231231.223432f);
    }
    @Override
    public void abonarReserva(float total) {
        adapterMercadoPago.abonarReserva(total);
    }
}