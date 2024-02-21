package org.example.metodosPago;

import org.example.metodosPago.interfac.MetodoPagamento;

public class Targeta implements MetodoPagamento {
    private float price;

    public Targeta(float price) {
        this.price = price;
    }

    @Override
    public void transacion() {
        System.out.println("transacion " + price + " by " + getClass().getSimpleName());
    }
}
