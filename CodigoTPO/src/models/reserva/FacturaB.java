package models.reserva;
public class FacturaB extends Factura {
    public FacturaB(int numeroFactura, String cuitCliente, float total) {
        this.numeroFactura = numeroFactura;
        this.cuitCliente = cuitCliente;
        this.total = total;
    }
}