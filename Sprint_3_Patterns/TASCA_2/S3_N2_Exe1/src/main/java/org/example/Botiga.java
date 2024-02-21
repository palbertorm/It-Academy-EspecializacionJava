package org.example;

import org.example.metodosPago.interfac.MetodoPagamento;

public class Botiga {
    private String nombre;

    public Botiga(String nombre) {
        this.nombre = nombre;
    }
    public void pagamento(MetodoPagamento pagamento) {

        Passarela passarela = new Passarela(this, pagamento);
    }
    public  void callback(){
        System.out.println("pagamento con sucesso");
    }
}
