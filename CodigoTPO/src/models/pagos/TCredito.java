package models.pagos;

import adapters.AdapterTCredito;

import java.time.LocalDate;

public class TCredito extends Tarjeta {
    private AdapterTCredito adapterTCredito;

    public TCredito(String titular, int numero, int codigoSeguridad, LocalDate vencimiento, float limite) {
        this.titular = titular;
        this.numero = numero;
        this.codigoSeguridad = codigoSeguridad;
        this.vencimiento = vencimiento;
    }

    @Override
    public void abonarReserva(float total) {
        adapterTCredito.abonarReserva(this.numero, total);
    }

}