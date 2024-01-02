package org.example;

public class TrabajadorOnline extends Trabajador{
    private static final int tarifaPlanaInternetn = 60;
    public TrabajadorOnline(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public double calcularSou(double horasTrabajada) {
        return getPrecioHora() * horasTrabajada + tarifaPlanaInternetn;
    }
    @Deprecated
    public int souHorasBaja(double horasTrabajada, double horasBaja) {

        return (int) (getPrecioHora() * (horasTrabajada - horasBaja)+ tarifaPlanaInternetn);
    }
}
