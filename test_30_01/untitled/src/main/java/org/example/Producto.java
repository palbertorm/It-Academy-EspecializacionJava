package org.example;

import java.util.Date;

public abstract class Producto {
    private static int idCache= 0;
    private int id;
    private String nombre;
    private String marca;
    private double precio;
    private int cantidadEstoque;
    private Date fechaCompra;

    public Producto( String nombre, String marca, double precio, int cantidadEstoque, Date fechaCompra, double porcentageRebaja) {
        this.id = idCache++;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidadEstoque = cantidadEstoque;
        this.fechaCompra = fechaCompra;
        this.porcentageRebaja = porcentageRebaja;
    }

    public static int getId() {
        return idCache;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadEstoque() {
        return cantidadEstoque;
    }

    public void setCantidadEstoque(int cantidadEstoque) {
        this.cantidadEstoque = cantidadEstoque;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getPorcentageRebaja() {
        return porcentageRebaja;
    }

    public void setPorcentageRebaja(double porcentageRebaja) {
        this.porcentageRebaja = porcentageRebaja;
    }

    private double porcentageRebaja;
}
/* TODO Auto-generated constructor:
* MTODO PORCENTAGE
* */
