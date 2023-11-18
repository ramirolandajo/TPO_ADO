package models.habitacion;

import java.util.List;

/**
 * 
 */
public class HabitacionBuilder {

    public HabitacionBuilder(String id,int personas,String tipo,float precio) {
        this.id = id;
        this.personas = personas;
        this.tipo = tipo;
        this.precio = precio;
        this.estado = "disponible";
    }
    private String id;
    private int personas;
    private String tipo;
    private String estado;
    public String getEstado() {
        return estado;
    }
    public String getId() {
        return id;
    }

    public int getPersonas() {
        return personas;
    }

    public String getTipo() {
        return tipo;
    }

    public List<Extra> getExtras() {
        return extras;
    }

    public float getPrecio() {
        return precio;
    }

    private List<Extra> extras;

    private float precio;

    public HabitacionBuilder asignarServicioTv() {
        this.extras.add(new ServicioTv());
        return this;
    }

    public HabitacionBuilder asignarServicioDespertador() {
        this.extras.add(new ServicioDespertador());
        return this;
    }

    public HabitacionBuilder asignarServicioMinibar() {
        this.extras.add(new ServicioMiniBar());
        return this;
    }

    public HabitacionBuilder asignarServicioInternet() {
        this.extras.add(new ServicioInternet());
        return this;
    }

    public Habitacion getHabitacion() {
        Habitacion habitacion = new Habitacion(this);
        return habitacion;
    }

}