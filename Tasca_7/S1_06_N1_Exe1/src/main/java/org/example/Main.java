package org.example;

public class Main {
    public static void main(String[] args) {
        TrabajadorOnline trabajadorOnline = new TrabajadorOnline("Helio","Gracie", 15);
        TrabajadorPresencial trabajadorPresencial = new TrabajadorPresencial("Juan","Saboia", 12);
        TrabajadorPresencial.setGasolina(285);
        System.out.println(trabajadorOnline.calcularSou(170));
        System.out.println(trabajadorPresencial.calcularSou(165.5));
    }
}