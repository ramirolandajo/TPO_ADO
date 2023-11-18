package models.reserva;
public class FacturaC extends Factura {
    public FacturaC(int numeroFactura, String cuitCliente, float total) {
        this.numeroFactura = numeroFactura;
        this.cuitCliente = cuitCliente;
        this.total = total;
    }
}