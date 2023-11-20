package models.pagos;

import java.util.*;

public abstract class Tarjeta implements MedioDePago {
    protected String titular;
    protected int numero;
    protected int codigoSeguridad;
    protected Date vencimiento;

    @Override
    public void abonarReserva(float total) throws IllegalAccessException {
        throw new IllegalAccessException("La clase abstracta Tarjeta no debe implementar el metodo abonarReserva");
    }

}