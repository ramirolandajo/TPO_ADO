package adapters;

import adapters.interfaces.AdapterMedioDePagoMP;

public class AdapterMercadoPago implements AdapterMedioDePagoMP {
    private String usuario;
    private float saldo;

    public AdapterMercadoPago(String usuario, float saldo) {
        this.usuario = usuario;
        this.saldo = saldo;
    }


    @Override
    public void abonarReserva(float total) {
        if (saldo - total >= 0) {
            saldo -= total;
            System.out.println("Se abono la reserva con exito. Saldo actualizado: " + saldo);
        }
        else {
            System.out.println("El saldo de mercado pago es insuficiente");
        }
    }
}