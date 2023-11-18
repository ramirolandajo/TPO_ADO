package controllers;

import models.Cliente;
import models.comunicacion.Gmail;
import models.pagos.Efectivo;
import models.pagos.MercadoPago;
import models.pagos.TCredito;
import models.pagos.TDebito;

import java.util.ArrayList;
import java.util.List;

public class ControllerCliente {

    private List<Cliente> listadoClientes = new ArrayList<>();

    private static ControllerCliente instancia;

    private ControllerCliente() {
         Cliente Cliente1 = new Cliente("sebastian","Bernasconi","11222333",
                 "bernaseba1@gmail.com",null,new Gmail(),new MercadoPago());

         Cliente Cliente2 = new Cliente("Ramiro","Landajo","22333444",
                    "ramalandajo@gmail.com",null,new Gmail(),new TCredito());

         Cliente Cliente3 = new Cliente("Mateo","Rosello","33444555",
                 "mateorosello@gmail.com",null,new Gmail(),new TDebito());

        Cliente Cliente4 = new Cliente("Valentin","Quiroga","44555666",
                "valenquiroga@gmail.com",null,new Gmail(),new MercadoPago());

        Cliente Cliente5 = new Cliente("Matias","Marano","55666777",
                "matimarano@gmail.com",null,new Gmail(),new Efectivo());

        Cliente Cliente6 = new Cliente("Ramiro","Landajo","66777888",
                "ramalandajo@gmail.com",null,new Gmail(),new TCredito());

        Cliente Cliente7 = new Cliente("Ivo","Bandoni","77888999",
                "ivobandoni@gmail.com",null,new Gmail(),new Efectivo());

    }
    public static ControllerCliente getInstancia() {
        if(instancia == null){
            return instancia =new ControllerCliente();
        }else {
            return instancia;
        }
    }
}
