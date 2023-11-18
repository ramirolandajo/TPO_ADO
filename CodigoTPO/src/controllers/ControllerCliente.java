package controllers;

import models.Cliente;
import models.comunicacion.Gmail;
import models.pagos.MercadoPago;

import java.util.ArrayList;
import java.util.List;

public class ControllerCliente {

    private List<Cliente> listadoClientes = new ArrayList<>();

    private static ControllerCliente instancia;

    private ControllerCliente() {
     Cliente Cliente1 = new Cliente("sebastian","Bernasconi","11222333",
             "bernaseba1@gmail.com",null,new Gmail(),new MercadoPago());

    }
    public static ControllerCliente getInstancia() {
        if(instancia == null){
            return instancia =new ControllerCliente();
        }else {
            return instancia;
        }
    }
}
