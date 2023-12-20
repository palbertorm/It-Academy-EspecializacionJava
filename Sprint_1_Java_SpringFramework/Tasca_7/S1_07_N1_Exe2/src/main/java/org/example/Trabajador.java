package org.example;

public abstract class Trabajador {
    private String nombre;
    private String apellido;
    private static final double PRECIO_HORA = 10;

    public Trabajador(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPrecioHora() {
        return PRECIO_HORA;
    }


    public abstract double calcularSou(double horasTrabajada);
    @Deprecated
    public abstract int souHorasBaja(double horasTrabajada, double horasBaja);

}
