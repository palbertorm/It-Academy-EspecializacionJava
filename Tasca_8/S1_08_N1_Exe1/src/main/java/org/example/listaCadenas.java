package org.example;


import java.util.List;

public class listaCadenas {
    public static void separarCadenas(List lista){
        lista.forEach((cadena)->{
            if (cadena.toString().contains("o")||cadena.toString().contains("O")){
                System.out.println(cadena);
            }
        });
    }
}
