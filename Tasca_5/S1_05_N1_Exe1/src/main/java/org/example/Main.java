package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting");
        String dir = "/Users/pauloalberto/Downloads";
        ListaDirectorio listaDirectorio = new ListaDirectorio();
        listaDirectorio.ordenarDirectorio(dir);
    }
}