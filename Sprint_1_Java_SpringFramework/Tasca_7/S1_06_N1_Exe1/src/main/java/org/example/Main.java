package org.example;

public class Main {
    public static void main(String[] args) {
        TrabajadorOnline trabajadorOnline = new TrabajadorOnline("Helio","Gracie");
        TrabajadorPresencial trabajadorPresencial = new TrabajadorPresencial("Juan","Saboia");
        TrabajadorPresencial.setGasolina(285);
        System.out.println(trabajadorOnline.calcularSou(170));
        System.out.println(trabajadorPresencial.calcularSou(165.5));
    }
}