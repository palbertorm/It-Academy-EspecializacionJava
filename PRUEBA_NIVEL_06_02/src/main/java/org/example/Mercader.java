package org.example;

import java.util.ArrayList;
import java.util.List;

public class Mercader extends NPC{
    private double precioOriginal;
    private static List<Item> itemsMercader = new ArrayList<>();
    public Mercader(String nombre, String ciudad,double precioOriginal) {
        super(nombre, ciudad);
        this.precioOriginal = precioOriginal;
    }
//    @Override
//    public void addItem(Item item) {
//        super.addItem(item);
//        if (itemsMercader.size() < 7) {
//            itemsMercader.add(item);
//        } else {
//            System.out.println(" La lista ya tiene 5 items.");
//        }
//    }
    public void calcularImpuesto() {
        precioOriginal *= (4 / 100);
    }

}
