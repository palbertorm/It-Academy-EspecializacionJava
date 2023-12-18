package org.example;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods obj1 = new NoGenericMethods(new Persona("person", "alguien", 31), new Persona("person", "espacio", 34), new Persona("person", "",45));
        NoGenericMethods obj2 = new NoGenericMethods(new Persona("person", "desaparecida", 31), new Persona("person", "encontrada", 34), new Persona("person", "",45));
    }
}