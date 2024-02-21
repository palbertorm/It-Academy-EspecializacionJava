package org.example.metodosPago;

import org.example.metodosPago.interfac.MetodoPagamento;

public class CuentaBancaria implements MetodoPagamento {
    private float price;

    public CuentaBancaria(float price) {
        this.price = price;
    }

    @Override
    public void transacion() {
        System.out.println("CuentaBancaria" + price + " payment by" + this.getClass().getSimpleName());
    }
}
