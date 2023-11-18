package controllers;

import adapters.AdapterTDebito;
import models.Cliente;
import models.comunicacion.Gmail;
import models.pagos.Efectivo;
import models.pagos.MercadoPago;
import models.pagos.TCredito;
import models.pagos.TDebito;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ControllerCliente {

    private List<Cliente> listadoClientes = new ArrayList<>();

    private static ControllerCliente instancia;

    private ControllerCliente() {
         Cliente Cliente1 = new Cliente("Sebastian","Bernasconi","11222333",
                 "bernaseba1@gmail.com",new Gmail(),new MercadoPago());

         Cliente Cliente2 = new Cliente("Ramiro","Landajo","22333444",
                    "ramalandajo@gmail.com",new Gmail(),new TCredito("Ramiro Landajo",
                 11223344,234, LocalDate.now(),200000));

         Cliente Cliente3 = new Cliente("Mateo","Rosello","33444555",
                 "mateorosello@gmail.com",new Gmail(),new TDebito(new AdapterTDebito(),"Mateo Rosello",
                 22334455,754,LocalDate.of(2027,10,04),100000));

        Cliente Cliente4 = new Cliente("Valentin","Quiroga","44555666",
                "valenquiroga@gmail.com",new Gmail(),new MercadoPago());

        Cliente Cliente5 = new Cliente("Matias","Marano","55666777",
                "matimarano@gmail.com",new Gmail(),new Efectivo());

        Cliente Cliente6 = new Cliente("Ramiro","Landajo","66777888",
                "ramalandajo@gmail.com",new Gmail(),new MercadoPago());

        Cliente Cliente7 = new Cliente("Ivo","Bandoni","77888999",
                "ivobandoni@gmail.com",new Gmail(),new Efectivo());

    }

    public static ControllerCliente getInstancia() {
        if(instancia == null){
            return instancia =new ControllerCliente();
        }else {
            return instancia;
        }
    }

    public void RegistrarCliente(String nombre, String apellido, String dni,
                                 String mail){
        Cliente cABuscar = BuscarCliente(dni);
        if (cABuscar != null){
            Cliente c = new Cliente(nombre,apellido,dni,mail, new Gmail(), null);
        }else {
            //deberia haber una excepcion...
            System.out.println("Ya existe un cliente con ese nro de documento");
        }

    }

    private Cliente BuscarCliente(String dni){
        for (Cliente c :
                listadoClientes) {
            if(c.soyEseCliente(dni)){
                return c;
            }
        }
        return null;
    }
}
