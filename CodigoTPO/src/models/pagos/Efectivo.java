package models.pagos;

public class Efectivo implements MedioDePago {

    @Override
    public void abonarReserva(float total) {
        System.out.println("Se abono la reserva con exito.");
    }
}