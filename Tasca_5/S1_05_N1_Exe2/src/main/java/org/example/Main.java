package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting");
        String dir = "/Users/pauloalberto/Documents";
        ListarDirectorio listarDirectorio = new ListarDirectorio();
        listarDirectorio.ordenarDirectorio(dir);
    }
}