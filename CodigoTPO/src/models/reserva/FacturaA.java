package models.reserva;

public class FacturaA extends Factura {
    public FacturaA(int numeroFactura, String cuitCliente, float total) {
        this.numeroFactura = numeroFactura;
        this.cuitCliente = cuitCliente;
        this.total = total;
    }
}