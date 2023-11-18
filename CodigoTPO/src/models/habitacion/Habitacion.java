package models.habitacion;

import java.util.*;

/**
 * 
 */
public class Habitacion {
    public Habitacion(HabitacionBuilder builder) {
        this.id = builder.getId();
        this.personas = builder.getPersonas();
        this.tipo = builder.getEstado();
        this.estado = builder.getEstado();
        this.extras = builder.getExtras();
        this.precio = builder.getPrecio();
    }
    private String id;

    private int personas;
    private String tipo;

    private String estado;
    private List<Extra> extras;

    private float precio;


    public void actualizarEstado(String estado) {
        this.estado=estado;
    }
    public boolean estaReservada() {
        return estado=="reservada";
    }
    public float obtenerTotal() {
        float total = this.precio;
        for (Extra e:extras) {
            total +=e.getPrecio();
        }
        return total;
    }
}