package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String retorar = rot13("zorra");
        System.out.println(retorar);
    }
    public static String rot13(String frase){
        ArrayList<String> letras = new ArrayList();
        for (char c = 'a'; c <= 'z'; c++) {
            letras.add(String.valueOf(c));
        }
       letras.forEach(String::trim);
//        for (String letra: letras) {
//            char exem;
//            letra = letras.get(13);
//            exem = frase.trim().replace(letra));
//return exem;
//        }
//        return "Hello world" + letras.toString();
//    }
        StringBuilder sb = new StringBuilder();

        String message = null;
        for (char c : letras) {
            if (Character.isAlphabetic(c)) {
                int shift = (c < 'n') ? 13 : -13; // Handle both lowercase and uppercase
                char shiftedChar = (char) (c + shift);

                // Ensure shifted character stays within alphabet bounds
                shiftedChar = shiftedChar < 'a' ? (char) (shiftedChar + 26) : shiftedChar;
                shiftedChar = shiftedChar > 'z' ? (char) (shiftedChar - 26) : shiftedChar;
                shiftedChar = shiftedChar < 'A' ? (char) (shiftedChar + 26) : shiftedChar;
                shiftedChar = shiftedChar > 'Z' ? (char) (shiftedChar - 26) : shiftedChar;

                sb.append(shiftedChar);
            } else {
                sb.append(c); // Keep non-alphabetic characters unchanged
            }
        }

        return sb.toString();
    }
}