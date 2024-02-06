package org.example;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String nombre;
    private  double precio;
    private  String tipo;
    private static List<Item> itemList = new ArrayList<>();

    public Item(String nombre, double precio, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }
    public void addItem(Item item) {
        itemList.add(item);
    }
}
