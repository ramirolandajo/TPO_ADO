package models.reserva;

import models.Cliente;
import models.Observer;
import models.habitacion.Habitacion;
import models.pagos.MedioDePago;
import models.Sujeto;
import java.util.*;

public class Reserva extends Sujeto {

    private int idReserva;
    private Habitacion habitacion;
    private Cliente cliente;
    private Date fechaRealizacion;
    private Date fechaIngreso;
    private Date fechaSalida;
    private float total;
    private MedioDePago medioDePago;
    private List<Observer> observers;
    private boolean pagada;

    public Reserva(int idReserva, Habitacion habitacion, Cliente cliente, Date fechaRealizacion, Date fechaIngreso,
                   Date fechaSalida) {
        this.idReserva = idReserva;
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.fechaRealizacion = fechaRealizacion;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.total = 0;
        this.medioDePago = cliente.obtenerMedioPago();
        //observers?
        this.pagada = false;
    }

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
    public boolean soyEsaReserva(int idReservaParam){

        return this.idReserva == idReservaParam;
    }
}