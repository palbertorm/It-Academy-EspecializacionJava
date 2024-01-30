package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class CorteIrlandes {
    static ArrayList<Producto> productos = new ArrayList<>();
    public static void crarProducto(String tipoProducto){
        if (tipoProducto.equalsIgnoreCase("ROPA")){
            Producto ropa = new Ropa( "camiseta street gangster", "DC", 20, 10,null,0,"XXl","Algodon","camiseta");
            productos.add(ropa);
        }
    }
    public static void listarProducto(int id){
        String name;
        for (Producto producto: productos) {
            name = producto.getNombre();
            System.out.println(name);
        }

    }
    public static void eliminarProducto(int id) {
        int indice = -1;
        Boolean found = false;
        for (int i = 0; i < productos.size() && !found; i++) {
            if (productos.get(i).getId() == id) {
                indice = i;
                found = true;
            }
        }
        if (indice != -1){
            productos.remove(indice);
        }
        else {
            System.out.println(" not found");
        }
    }
}
