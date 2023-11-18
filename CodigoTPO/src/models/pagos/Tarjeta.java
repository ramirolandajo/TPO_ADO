package models.pagos;

import java.util.*;

public abstract class Tarjeta implements MedioDePago {
    private String titular;
    private int numero;
    private int codigoSeguridad;
    private Date vencimiento;

    @Override
    public void abonarReserva(float total) throws IllegalAccessException {
        throw new IllegalAccessException("La clase abstracta Tarjeta no debe implementar el metodo abonarReserva");
    }

}