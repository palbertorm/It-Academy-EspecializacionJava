package org.example;

import java.util.Date;

public class Ropa extends Producto {
    private String talla;
    private String tipoTejano;
    private String prenda;

    public Ropa(String nombre, String marca, double precio, int cantidadEstoque, Date fechaCompra, double porcentageRebaja, String talla, String tipoTejano, String prenda) {
        super( nombre, marca, precio, cantidadEstoque, fechaCompra, porcentageRebaja);
        this.talla = talla;
        this.tipoTejano = tipoTejano;
        this.prenda = prenda;
    }
}
