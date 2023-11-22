package models.reserva;

import logs.Log;
import models.Cliente;
import models.Observer;
import models.habitacion.Habitacion;
import models.pagos.MedioDePago;
import models.Sujeto;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Reserva extends Sujeto {

    private int idReserva;
    private Habitacion habitacion;
    private Cliente cliente;
    private LocalDate fechaRealizacion;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;
    private float total;
    private MedioDePago medioDePago;
    private List<Observer> observers;
    private Estado estadoReserva;

    public Reserva(int idReserva, Habitacion habitacion, Cliente cliente, LocalDate fechaRealizacion, LocalDate fechaIngreso,
                   LocalDate fechaSalida) {
        this.idReserva = idReserva;
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.fechaRealizacion = fechaRealizacion;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.total = 0;
        this.medioDePago = cliente.obtenerMedioPago();
        //observers?
        this.estadoReserva = Estado.REGISTRADA;
        this.observers =  new ArrayList<>();
        observers.add(new Log());
    }

    public void notificar(String mensaje) {
        for(Observer ob : observers){
            ob.actualizar(mensaje);
        }
    }
    public void agregarObservador(Observer observer) {
        this.observers.add(observer);
    }
    public void quitarObservador(Observer observer) {
        this.observers.remove(observer);
    }
    public void generarFactura(TipoFactura tipo) {
        if (tipo == TipoFactura.A){
            Factura f = new FacturaA(this.cliente.obtenerDni(),this.total);
            this.cliente.getMedioDeComunicacion().enviarMensaje("Nueva Factura de tipo " + tipo + " disponible");
        } else if (tipo == TipoFactura.B) {
            Factura f = new FacturaB(this.cliente.obtenerDni(),this.total);
            this.cliente.getMedioDeComunicacion().enviarMensaje("Nueva Factura de tipo " + tipo + " disponible");
        } else if (tipo == TipoFactura.C) {
            Factura f = new FacturaC(this.cliente.obtenerDni(),this.total);
            this.cliente.getMedioDeComunicacion().enviarMensaje("Nueva Factura de tipo " + tipo + " disponible");
        }else {
            System.out.println("El tipo de factura ingresado no es valido");
        }
    }
    public void actualizarEstado(Estado estado) {

        this.estadoReserva = estado;
        this.notificar("Se actualizo el estado de la reserva a " + estado);
    }
    public float calcularTotal() {
        this.total += this.habitacion.obtenerTotalExtras();
        this.total += this.calcularDescuento();
        return this.total;
    }
    public float calcularDescuento() {
        float totalDescuento = 0;
        long diferenciaFechas = ChronoUnit.DAYS.between(this.fechaRealizacion, this.fechaIngreso);
        if (diferenciaFechas <= 15){
            totalDescuento += (this.habitacion.getPrecio())-(this.habitacion.getPrecio() * 15) / 100;
        } else if (diferenciaFechas >= 58) {
            totalDescuento += (this.habitacion.getPrecio()) + (this.habitacion.getPrecio() * 20)/ 100;
        }else{
            totalDescuento = this.habitacion.getPrecio();
        }
        return totalDescuento;
    }

    public Estado getEstadoReserva() {
        return estadoReserva;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getFechaRealizacion() {
        return fechaRealizacion;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public float getTotal() {
        return total;
    }

    public MedioDePago getMedioDePago() {
        return medioDePago;
    }

    public boolean soyEsaReserva(int idReservaParam){

        return this.idReserva == idReservaParam;
    }

}