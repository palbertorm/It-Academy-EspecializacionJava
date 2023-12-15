package org.example;

public class Main {
    public static void main(String[] args) {
        TrabajadorOnline trabajadorOnline = new TrabajadorOnline("Helio","Gracie", 15);
        trabajadorOnline.souHorasBaja(100, 60);
        TrabajadorPresencial trabajadorPresencial = new TrabajadorPresencial("Juan","Saboia", 12);
        TrabajadorPresencial.setGasolina(285);
        System.out.println(" sueldo trabajador online " + trabajadorOnline.calcularSou(170));
        System.out.println(" sueldo trabajador presencial " + trabajadorPresencial.calcularSou(165.5));
        System.out.println(" sueldo con baja y metodo deprecated de trabajador online " + trabajadorOnline.souHorasBaja(100, 60));
        System.out.println(" sueldo con baja  de trabajador presencial " + trabajadorPresencial.souHorasBaja(100, 60));
    }
}