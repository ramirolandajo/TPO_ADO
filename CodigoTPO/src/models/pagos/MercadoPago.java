package models.pagos;

import adapters.AdapterMercadoPago;

public class MercadoPago implements MedioDePago {
    AdapterMercadoPago adapterMercadoPago;

    @Override
    public void abonarReserva(float total) {
        adapterMercadoPago.abonarReserva(total);
    }
}