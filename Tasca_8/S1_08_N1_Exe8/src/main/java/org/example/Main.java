package org.example;

public class Main {
    public static void main(String[] args) {
        interfaceReves metodo = () -> "cadena";
        System.out.println(metodo.reverse1(metodo.reverse()));
    }
}