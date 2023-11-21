package controllers;

import models.Cliente;
import models.habitacion.Habitacion;
import models.reserva.Reserva;
import models.reserva.TipoFactura;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ControllerReserva {

    private List<Reserva> listadoReservas = new ArrayList<>();

    private static ControllerReserva instancia;

    private ControllerReserva(){
        //hardcodear 3 reservas
    }
    public static ControllerReserva getInstancia(){
        if(instancia == null){
            return instancia = new ControllerReserva();
        }else {
            return instancia;
        }
    }
    public void CrearReserva(Habitacion habitacion, Cliente cliente,
                             LocalDate fechaRealizacion, LocalDate fehcaIngreso, LocalDate fechaSalida){
        Reserva r = new Reserva(1,habitacion,cliente,fechaRealizacion,fehcaIngreso,fechaSalida);
        r.notificar("Se actualizo el estado de la reserva a " + r.getEstadoReserva());
        listadoReservas.add(r);
    }
    public void GenerarFactura(TipoFactura tipo, int idReserva){
        Reserva r = BuscarReserva(idReserva);
        if(r != null){
            r.calcularTotal();
            r.generarFactura(tipo);
        }
    }
    private Reserva BuscarReserva(int idReserva){
        for (Reserva r :
                listadoReservas) {
            if (r.soyEsaReserva(idReserva)){
                return r;
            }
        }
        return null;
    }

}

