package models;
import models.reserva.Reserva;

import java.util.*;

public abstract class Sujeto {
    protected List<Observer> obserbers;
    abstract public void notificar(String mensaje, Reserva r);
    abstract public void agregarObservador(Observer observador);
    abstract public void quitarObservador(Observer observador);
}