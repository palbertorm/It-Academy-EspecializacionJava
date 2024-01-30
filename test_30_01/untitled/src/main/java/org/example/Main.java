package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int option;

        do {
            showMenu();
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("que tipo de producto quieres crear");
                    String tipoProducto = input.next();
                    CorteIrlandes.crarProducto(tipoProducto);

                    break;
            }
        }while (option!= 0);
    }
    public static void showMenu() {
        System.out.println(" chosse one option : \n"
                + "1. Crear producto. \n"
                + "2. Listar producto. \n"
                + "3. Eliminar producto \n"
                + "4. Calcular fecha vencimento de garantia \n"
                + "5. Aplicar rebajas producto \n"
                + "6. Productos en Rebaja \n"
                + "0. Salir de la aplicaion \n");
    }

}