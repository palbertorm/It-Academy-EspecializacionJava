package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option = 0;
        Scanner input = new Scanner(System.in);
        GestorNPC gestorNPC = new GestorNPC();
        do {
        showMenu();
            option = input.nextInt();
        switch (option) {
            case 1:
                gestorNPC.addNPC();
                break;
            case 2:
                gestorNPC.crearItem();
                break;
            case 3:
                gestorNPC.addItem();
            case 0:
                break;
            default:
                System.out.println("opcion invalida");
        }
        }while (option!= 0);

    }

    public static void showMenu() {
        System.out.println(" chosse onde option : \n"
                + "1. Crear un NPC \n "
                + "2 . Crear Item \n"
                + "3. Añadir un item al inventario de un NPC. \n"
                + "4. Crear un jugador. \n"
                + "5. Que un Jugador pueda comprar un item a un NPC.. \n"
                + "6. Mostrar el ítem más barato de todos los vendedores de una ciudad \n"
                + "0. salir");
    }
}