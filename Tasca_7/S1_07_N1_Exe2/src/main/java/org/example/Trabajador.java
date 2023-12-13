package org.example;

public abstract class Trabajador {
    String nombre;
    String apellido;
    double precioHora;

    public Trabajador(String nombre, String apellido, double precioHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.precioHora = precioHora;
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
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }
    public abstract double calcularSou(double horasTrabajada);
    @Deprecated
    public abstract int souHorasBaja(double horasTrabajada, double horasBaja);

}
