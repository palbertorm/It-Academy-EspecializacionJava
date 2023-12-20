package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Paulo", 32, 635295780);
        persona.serObjecto(persona);
        persona.deserObject();



    }

}