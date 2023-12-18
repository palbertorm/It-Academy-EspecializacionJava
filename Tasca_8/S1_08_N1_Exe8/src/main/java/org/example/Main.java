package org.example;

public class Main {
    public static void main(String[] args) {
        interfaceReves metodo = (s) ->{
            String cadenaInvertida = "";
            int i = s.length() - 1;
            while (i >= 0) {
                cadenaInvertida += s.charAt(i);
                i--;
            }
            return cadenaInvertida;
        };
        String cadena = "precario";
        String strReverse = metodo.reverse(cadena);

        System.out.println(strReverse);
    }
}