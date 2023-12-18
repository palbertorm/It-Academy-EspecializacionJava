package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cadenas = new ArrayList<String>();
        cadenas.add("morro");
        cadenas.add("España");
        cadenas.add("Madrid");
        cadenas.add("Odemira");
        cadenas.add("Fortaleza");
        cadenas.add("Sevilla");
        cadenas.add("ocata");
        cadenas.add("octo");
        ListaCadenas.separarCadenas(cadenas);

    }
}