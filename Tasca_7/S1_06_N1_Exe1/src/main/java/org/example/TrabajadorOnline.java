package org.example;

public class TrabajadorOnline extends Trabajador{
    private static final int TARIFA_PLANA_INTERNETN = 60;
    public TrabajadorOnline(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public double calcularSou(double horasTrabajada) {
        return getPrecioHora() * horasTrabajada + TARIFA_PLANA_INTERNETN;
    }
}
