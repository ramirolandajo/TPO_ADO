package models.reserva;

public class FacturaA extends Factura {

    public FacturaA(String cuitCliente, float total) {
        this.numeroFactura = 1234567653;
        this.cuitCliente = cuitCliente;
        this.total = total;
    }
}