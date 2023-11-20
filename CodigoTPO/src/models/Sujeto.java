package models;
import java.util.*;

public abstract class Sujeto {
    protected List<Observer> obserbers;
    abstract public void notificar(String mensaje);
    abstract public void agregarObservador(Observer observador);
    abstract public void quitarObservador(Observer observador);
}