package org.example;

import java.util.ArrayList;
import java.util.List;

public class Campesino extends NPC implements Impuesto{
    private double precioOriginal;
    private static List<Item> itemCampesino = new ArrayList<>();

    public Campesino(String nombre, String ciudad, double precioOriginal) {
        super(nombre, ciudad);
        this.precioOriginal = precioOriginal;
    }

    public double getPrecioOriginal() {
        return precioOriginal;
    }

    public void setPrecioOriginal(double precioOriginal) {
        this.precioOriginal = precioOriginal;
    }

    @Override
//    public void addItem(Item item) {
//        super.addItem(item);
//        if (items.size() < 5) {
//            items.add(item);
//        } else {
//            System.out.println(" La lista ya tiene 5 items.");
//        }
//    }
    public void calcularImpuesto() {
        precioOriginal *= (2 / 100);
    }
}
