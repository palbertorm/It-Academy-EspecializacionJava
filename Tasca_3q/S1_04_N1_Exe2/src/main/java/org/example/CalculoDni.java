package org.example;

public class CalculoDni {
    private int numeroDni;
    private String nombreDni;

    public CalculoDni(int numeroDni, String nombreDni) {
        this.numeroDni = numeroDni;
        this.nombreDni = nombreDni;
    }

    public int getNumeroDni() {
        return numeroDni;
    }

    public String getNombreDni() {
        return nombreDni;
    }
    //TODO change String for an integer as parameter
    public char compruebaDni(int numDni){
        numDni = getNumeroDni();
        String letras = "trwagmyfpdxbnjzsqvhlcke";
        //int longitudDni = numDni.length();
//        numDni = numDni.replaceAll("-", "");
//        String separaNums = numDni.substring(1);
//        int numInt= Integer.parseInt(separaNums);
        int calculoDni = numDni % 23;
        char indexDni = letras.charAt(calculoDni);
        return indexDni;
    }
}
