package org.example;

import java.util.Date;

public class Belleza extends Producto {
    private String vegano;
    private String temporada;

    public Belleza( String nombre, String marca, double precio, int cantidadEstoque, Date fechaCompra, double porcentageRebaja, String vegano, String temporada) {
        super( nombre, marca, precio, cantidadEstoque, fechaCompra, porcentageRebaja);
        this.vegano = vegano;
        this.temporada = temporada;
    }
}
