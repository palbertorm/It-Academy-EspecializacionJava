import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    static ArrayList<NPC> vendedores = new ArrayList<NPC>();
    public static void main(String[] args) {
        int option = 0;
crearCampesino("madrid",30);
anadirItemIventario("campesino","bajo", 30,"intrumiento");
anadirItemIventario("campesino","flauta", 40,"intrumiento");
//        do {
//            showMenu();
//
//        }while (option !=0);
    }
    public static void showMenu() {
        System.out.println(" chosse onde option : \n"
                + "1. Crear un vendedor \n"
                + "2. Añadir un item al inventario de un vendedor. \n"
                + "3. Mostrar el ítem más barato de todos los vendedores de una ciudad. \n"
                + "4. Consultar los ítems de un vendedor. \n"
                + "5. Realizar la venta de un ítem. \n"
                + "0. quit");
    }
    public  static void crearCampesino(String ciudad ,double precioOriginal){

        Campesino campesino = new Campesino("campesino", ciudad, precioOriginal);
        vendedores.add(campesino);

    }
    public static void anadirItemIventario(String nombreVendedor, String nombreItem, double precio, String tipo){
        Item item = new Item(nombreItem, precio, tipo);
        boolean found = false;
        int size = vendedores.size();
        for (int i = 0; i < size; i++){
            if (vendedores.get(i).getNombre().equalsIgnoreCase(nombreVendedor)){
                for (NPC vendedor : vendedores){
                    vendedor.addItem(item);

                }
            }
        }
//!Objects.equals(redactor.getDni(), ""
    }
}
/*Nos piden que programemos los NPCs (Vendedores) de un juego de rol. Existen tres categorías de NPCs: Campesino, Ladrón y Mercader.
El campesino tiene hasta 5 ítems para vender y al precio original le agrega un impuesto del 2%. El ladrón, hasta 3 y no cobra impuestos.
 El mercader, hasta 7 y cobra un 4% de impuestos. Cada NPC está ubicado en una ciudad. Los ítems tienen un nombre, un tipo, un precio y porcentaje de desgaste.
 Cuando un ladrón agrega un ítem a su inventario este se deteriora un 25%. Cuando lo hace un campesino, un 15%. En cambio, un mercader conoce muy bien cómo guardar sus ítems para que no se estropeen.


La aplicación permite:

1 - Crear un vendedor.
2 - Añadir un item al inventario de un vendedor.
3 - Mostrar el ítem más barato de todos los vendedores de una ciudad.
4 - Consultar los ítems de un vendedor.
5 - Realizar la venta de un ítem.
*/