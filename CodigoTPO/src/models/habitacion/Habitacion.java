package models.habitacion;

import java.util.*;

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

    public String getId() {
        return id;
    }

    public int getPersonas() {
        return personas;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }

    public List<Extra> getExtras() {
        return extras;
    }

    public float getPrecio() {
        return precio;
    }

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
    public boolean soyEsaHabitacion(String idHabitacion){
        return this.id == idHabitacion;
    }
}