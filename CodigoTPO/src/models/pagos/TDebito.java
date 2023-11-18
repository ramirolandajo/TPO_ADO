package models.pagos;

import adapters.AdapterTDebito;

import java.util.Date;

public class TDebito extends Tarjeta {
    private AdapterTDebito adapterTDebito;

    public TDebito(AdapterTDebito adapterTDebito, String titular, int numero, int codigoSeguridad, Date vencimiento) {
        this.adapterTDebito = adapterTDebito;
        this.titular = titular;
        this.numero = numero;
        this.codigoSeguridad = codigoSeguridad;
        this.vencimiento = vencimiento;
    }

    @Override
    public void abonarReserva(float total) {
        adapterTDebito.abonarReserva(this.numero, total);
    }
}