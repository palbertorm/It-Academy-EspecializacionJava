package org.example.selectoPago;

import org.example.metodosPago.CuentaBancaria;
import org.example.metodosPago.Paypal;
import org.example.metodosPago.Targeta;
import org.example.metodosPago.interfac.MetodoPagamento;

import java.util.Scanner;

public class SelectorPago {
    public static MetodoPagamento selectorPago(float price){
        MetodoPagamento metodoPagamento = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el metodo de pago: Paypal - Conta Bancaria - Tarjeta");
        String res = input.next().toLowerCase();
        switch (res) {
            case "paypal" -> metodoPagamento = new Paypal(price);
            case "conta bancaria" -> metodoPagamento = new CuentaBancaria(price);
            case "tarjeta" -> metodoPagamento = new Targeta(price);
        }
        return metodoPagamento;
    }
}
