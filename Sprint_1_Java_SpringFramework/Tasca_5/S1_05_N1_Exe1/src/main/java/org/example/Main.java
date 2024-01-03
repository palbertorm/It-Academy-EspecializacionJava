package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting");
        String dir = "../It-Academy-EspecializacionJava";
        ListaDirectorio listaDirectorio = new ListaDirectorio();
        listaDirectorio.ordenarDirectorio(dir);
    }
}