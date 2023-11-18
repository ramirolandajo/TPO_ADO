package adapters;

import adapters.interfaces.AdapterMedioDePagoTrasnferencia;

public class AdapterTransferencia implements AdapterMedioDePagoTrasnferencia {
    private String cuentaCliente;
    private float saldo;

    public AdapterTransferencia(String cuentaCliente, float saldo) {
        this.cuentaCliente = cuentaCliente;
        this.saldo = saldo;
    }

    @Override
    public void abonarReserva(String cuentaHotel, float total) {
        if (saldo - total >= 0) {
            saldo -= total;
            System.out.println("Se abono la reserva con exito. Saldo actualizado: " + saldo);
        }
        else {
            System.out.println("El saldo de la transferencia es insuficiente");
        }
    }

}