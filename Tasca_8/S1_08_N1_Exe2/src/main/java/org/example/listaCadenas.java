package org.example;


import java.util.List;

public class listaCadenas {
    public static void separarCadenas(List lista){
        lista.forEach((cadena)->{
            if ((cadena.toString().contains("o")||cadena.toString().contains("O")) && cadena.toString().length() > 5){
                System.out.println(cadena);
            }
        });
    }
}
