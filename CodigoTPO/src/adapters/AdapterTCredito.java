package adapters;

import adapters.interfaces.AdapterMedioDePagoTCredito;

public class AdapterTCredito implements AdapterMedioDePagoTCredito {
    private float limiteTarjeta;

    @Override
    public void abonarReserva(long nroTar, float total) {
        if (limiteTarjeta - total >= 0) {
            limiteTarjeta -= total;
            System.out.println("Limite de la tarjeta restante actualizado: " + limiteTarjeta);
        }
        else {
            System.out.println("El limite de la tarjeta no es suficiente para hacer el pago");
        }
    }
}