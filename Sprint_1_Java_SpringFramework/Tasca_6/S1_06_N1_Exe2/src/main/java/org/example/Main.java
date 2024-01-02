package org.example;

public class Main {
    public static void main(String[] args) {
        Persona humano = new Persona("Luiz", "Gama", 32);
        String nombre = "Dandara";
        GenericMethods obj1 = new GenericMethods<>(humano, nombre, 34);
        obj1.toPrint();
        GenericMethods obj2 = new GenericMethods<>(32, nombre, humano);
    }
}