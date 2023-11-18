package adapters;

import adapters.interfaces.AdapterMedioDePagoTDebito;

public class AdapterTDebito implements AdapterMedioDePagoTDebito {
    private float saldo;
    @Override
    public void abonarReserva(int nroTar, float total) {
        if (saldo - total >= 0) {
            saldo -= total;
            System.out.println("Se abono la reserva con exito. Saldo actualizado: " + saldo);
        }
        else {
            System.out.println("El saldo de la tarjeta es insuficiente");
        }
    }
}