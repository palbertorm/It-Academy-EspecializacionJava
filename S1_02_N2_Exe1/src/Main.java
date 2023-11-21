public class Main {
    public static void main(String[] args) throws Exception {
        String mensaje = "dime tu edad";
        String palabra = "dime una palabra";
        boolean valid = false;
        byte edad = Entrada.leerByte(mensaje);
        int edad1 = Entrada.leerInt(mensaje);
        float edad2 = Entrada.leerFloat(mensaje);
        double edad3 = Entrada.leerDouble(mensaje);
        /*try{
            Entrada.leerChar(palabra);
        }catch (Exception e){
            System.err.println("Error: Ingresa solo una letra" + e.getMessage());
        }*/
        Entrada.leerChar(palabra);
        Entrada.leerString(palabra);
        Entrada.lerSiNo(palabra);

    }
}
/*Crea una clase llamada "Entrada". Esta clase debe servir para controlar las distintas excepciones que pueden aparecer en Java a la hora de introducir datos por teclado utilizando la clase Scanner.

Lo primero que debe hacerse es instanciar un objeto de la clase Scanner ya partir de ahí, crear métodos estáticos para leer los diferentes tipos de datos desde el teclado.

Importante

Es importante que si en algún método salta una excepción, la tratamos y volvemos a pedir el dato al usuario hasta que éste esté bien introducido. Por ejemplo: Si introduce un float con un punto en lugar de con una coma, debe mostrar “Error de formato”. Hasta que el usuario/a no introduce un float bien formado debe seguir pidiendo el dato.

Todos los métodos reciben un String con el mensaje que se quiere mostrar al usuario, por ejemplo: “Introduce tu edad”, y devuelven el dato oportuno introducido por el usuario en cada método, por ejemplo: uno byte con la edad del usuario/a.

Métodos a implantar capturando la excepción de la clase InputMismatchException:

public static byte leerByte(String mensaje);

public static int leerInt(String mensaje);

public static float leerFloat(String mensaje);

public static double leerDouble(String mensaje);

Métodos a implantar capturando la excepción de la clase Exception:

public static char leerChar(String mensaje);

public static String leerString(String mensaje);

public static boolean leerSiNo(String mensaje), si el usuario introduce “s”, devuelve “true”, si el usuario introduce “n”, devuelve “false”.

*/