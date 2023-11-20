package models.pagos;

import adapters.AdapterTDebito;

import java.time.LocalDate;
import java.util.Date;

public class TDebito extends Tarjeta {
    private AdapterTDebito adapterTDebito;
    private float saldo;

    public TDebito(AdapterTDebito adapterTDebito, String titular, int numero, int codigoSeguridad, Date vencimiento, float saldo) {
        this.adapterTDebito = adapterTDebito;
        this.titular = titular;
        this.numero = numero;
        this.codigoSeguridad = codigoSeguridad;
        this.vencimiento = vencimiento;
        this.saldo = saldo;
    }

    @Override
    public void abonarReserva(float total) {
        adapterTDebito.abonarReserva(this.numero, total);
    }
}