package org.example;

import java.util.List;

@FunctionalInterface
public interface interfaceReves {
    String reverse(String string);
//    default String reverse1(String string){
//        String cadenaInvertida = "";
//        int i = string.length() - 1;
//        while (i >= 0) {
//            cadenaInvertida += string.charAt(i);
//            i--;
//        }
//        return cadenaInvertida;
//    }
}
