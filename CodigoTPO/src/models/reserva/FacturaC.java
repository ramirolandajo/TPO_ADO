package models.reserva;
public class FacturaC extends Factura {
    public FacturaC(String cuitCliente, float total) {
        this.numeroFactura = 234567890;
        this.cuitCliente = cuitCliente;
        this.total = total;
    }
}