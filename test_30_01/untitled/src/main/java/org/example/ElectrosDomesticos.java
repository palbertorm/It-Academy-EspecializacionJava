package org.example;

import java.util.Date;

public class ElectrosDomesticos extends Producto {
    private int consumoEnergetico;
    private Date fechaFabricacion;

    public ElectrosDomesticos( String nombre, String marca, double precio, int cantidadEstoque, Date fechaCompra, double porcentageRebaja, int consumoEnergetico, Date fechaFabricacion) {
        super( nombre, marca, precio, cantidadEstoque, fechaCompra, porcentageRebaja);
        this.consumoEnergetico = consumoEnergetico;
        this.fechaFabricacion = fechaFabricacion;
    }

    //TODO: GARANTIA
}
