package models.reserva;

import models.Cliente;
import models.habitacion.Habitacion;
import models.pagos.MedioDePago;
import models.Sujeto;
import java.util.*;

public class Reserva extends Sujeto {

    public Reserva() {
    }
    private String idReserva;
    private Habitacion habitacion;
    private Cliente cliente;
    private Date fechaRealizacion;
    private Date fechaIngreso;
    private Date fechaSalida;
    private float total;
    private MedioDePago medioDePago;
    private List<Observer> observers;
    private boolean pagada;
    public void notificar() {

    }
    public void agregarObservador() {

    }
    public void quitarObservador() {

    }
    public void generarFactura() {

    }
    public void actualizarEstado() {

    }
    public float calcularTotal() {
        return 0.0f;
    }
    public float calcularDescuento() {
        return 0.0f;
    }

}