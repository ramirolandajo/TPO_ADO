package models;
import java.util.*;

public abstract class Sujeto {
    protected List<Observer> obserbers;
    abstract public void notificar();
    abstract public void agregarObservador();
    abstract public void quitarObservador();
}