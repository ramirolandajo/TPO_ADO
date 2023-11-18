package controllers;

import models.reserva.Reserva;

import java.util.ArrayList;
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

}

