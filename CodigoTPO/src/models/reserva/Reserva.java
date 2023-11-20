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
    private Estado estadoReserva;

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
        this.estadoReserva = Estado.REGISTRADA;
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
        } else if (tipo == TipoFactura.B) {
            Factura f = new FacturaB(this.cliente.obtenerDni(),this.total);
        } else if (tipo == TipoFactura.C) {
            Factura f = new FacturaC(this.cliente.obtenerDni(),this.total);
        }else {
            System.out.println("El tipo de factura ingresado no es valido");
        }
    }
    public void actualizarEstado(Estado estado) {
        this.estadoReserva = estado;
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