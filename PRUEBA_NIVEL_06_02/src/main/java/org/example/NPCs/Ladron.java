package org.example;

import java.util.ArrayList;
import java.util.List;

public class Ladron extends NPC{

    private static List<Item> itemsLadron = new ArrayList<>();
    public Ladron(String nombre, String ciudad) {
        super(nombre, ciudad);
    }

//    @Override
//    public void addItem(Item item) {
//        super.addItem(item);
//        if (itemsLadron.size() < 3) {
//            itemsLadron.add(item);
//        } else {
//            System.out.println(" La lista ya tiene 5 items.");
//        }
//    }
}
