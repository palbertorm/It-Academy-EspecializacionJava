package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorNPC {
    private static List<NPC> npcList = new ArrayList<>();
    private  static List<Item>itemList = new ArrayList<>();
    public void addNPC(){
        Scanner input = new Scanner(System.in);
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
    public void crearItem(){
        Item item1 = new Item("arma_dorada", 30, "arma");
       itemList.add(item1);
    }
    public void addItem(){

        int indice = -1;
        boolean found = false;
        for (int i = 0; i <npcList.size() && !found; i++) {
            if (npcList.get(i) instanceof Campesino){
                Item item2 = new Item("Flecha", 30, "arma");
                ((Campesino) npcList.get(i)).setItemCampesino(item2);
                itemList.add(item2);
            }
        }
    }

}
