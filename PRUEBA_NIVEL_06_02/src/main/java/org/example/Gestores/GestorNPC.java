package org.example.NPCs;

import org.example.Item;
import org.example.NPCTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorNPC {

        List<NPC>npcList = new ArrayList<NPC>();
        List<Item>items = new ArrayList<Item>();
        Scanner input = new Scanner(System.in);
    public void addNPC(){
        System.out.println(" Eliges un tipo de NPC: 1 .Campesino 2. Ladron 3.Mercader");
        int optionNPC = input.nextInt();
        switch (optionNPC) {
            case 1:
                Campesino campesino = new Campesino("Geramy", "Barcelona",50);
                npcList.add(campesino);
                break;
            case 2:
                Ladron ladron = new Ladron("Romina", "Rosario");
                npcList.add(ladron);

                break;
            case 3:
                Mercader mercader = new Mercader("Caballero", "Madrid",50);
                npcList.add(mercader);
                break;
            default:
                System.out.println("opcion invalida");
        }

    }
    public Item crearItem(){
        Item item1 = new Item("arma_dorada", 30, "arma");
        items.add(item1);
        return item1;
    }
    public void addItem(){
//        NPCTypes npcTypes;
//        npcTypes = new NPCTypes();
        System.out.println("dime el nombre del npc el cual quieres add el item");
        String npcTipo = input.next().toUpperCase();
        switch (npcTipo){
            case "CAMPESINO":
                npcList.forEach(npc -> npc.addItem(crearItem()));
                break;
            case "MERCADERO":
                npcList.forEach(npc -> npc.addItem(items.get(0)));
                break;
        }
//        int indice = -1;
//        boolean found = false;
//        for (int i = 0; i <npcList.size() && !found; i++) {
//
//            if (npcList.get(i) instanceof Campesino){
//                crearItem();
//                //Item item2 = new Item("Flecha", 30, "arma");
//                ((Campesino) npcList.get(i)).addItem(items.get(0));
//                found = true;
//            }
//        }
    }
//TODO: crerar metyodos necessarios del menu y en el main llamno a esta clase
}
