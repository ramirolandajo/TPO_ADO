package models;

public abstract class Usuario {
    protected String dni;
    protected String nombre;
    protected String apellido;
    protected String mail;

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMail() {
        return mail;
    }
}