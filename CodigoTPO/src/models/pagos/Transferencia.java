package models.pagos;

import adapters.AdapterTransferencia;

public class Transferencia implements MedioDePago {
    AdapterTransferencia adapterTransferencia;

    @Override
    public void abonarReserva(float total) {
        adapterTransferencia.abonarReserva("Cuenta Hotel 1", total);
    }
}