import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static double precio;
    static String nombre;
    public static void main(String[] args) {
        Venta venta = new Venta();

        try {
            venta.calcularTotal();
        }catch (VentaBuidaException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Producto producto1 = new Producto("Coca Cola", 5.10);
        venta.agregarProducto(producto1);
        try {
            venta.calcularTotal();
            System.out.println(" precio total de ventas: " + venta.getPrecioTotalVenta());
            System.out.println(" fuera del rango: " + venta.getProducts().get(3));
        } catch (VentaBuidaException | IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());;
        }
    }
}