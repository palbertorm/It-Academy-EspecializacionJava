package org.example;

import org.example.metodosPago.interfac.MetodoPagamento;
import org.example.selectoPago.SelectorPago;

public class Main {
    public static void main(String[] args) {
        float price = 150;
        Botiga botiga = new Botiga("Herbalist");
        Passarela passarela = new Passarela(botiga, SelectorPago.selectorPago(price));
        passarela.execute();
    }
}