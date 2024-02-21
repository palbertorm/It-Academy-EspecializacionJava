package org.example.NPCs;

import org.example.Item;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String nombre;
     private List<Item> items;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.items = new ArrayList<Item>();
    }
    public void comprarItems(NPC npc, Item item) {
        items.add(item);
        npc.itemList.remove(item);
    }

}
