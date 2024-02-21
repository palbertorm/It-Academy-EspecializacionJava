package org.example;

import org.example.metodosPago.interfac.MetodoPagamento;

public class Passarela {
    private Botiga botiga;
    private MetodoPagamento metodoPagamento;

    public Passarela(Botiga botiga, MetodoPagamento metodoPagamento) {
        this.botiga = botiga;
        this.metodoPagamento = metodoPagamento;
    }

    public void execute() {
        metodoPagamento.transacion();
        botiga.callback();
    }
}
