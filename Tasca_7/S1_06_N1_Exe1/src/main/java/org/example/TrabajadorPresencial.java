package org.example;

public class TrabajadorPresencial extends Trabajador{
    private static int gasolina;
    public TrabajadorPresencial(String nombre, String apellido, double precioHora) {
        super(nombre, apellido, precioHora);
    }

    public static int getGasolina() {
        return gasolina;
    }

    public static void setGasolina(int gasolina) {
        TrabajadorPresencial.gasolina = gasolina;
    }

    @Override
    public double calcularSou(double horasTrabajadaMes) {
        return getPrecioHora() * horasTrabajadaMes + gasolina;
    }
}
