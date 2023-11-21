import java.util.InputMismatchException;
import java.util.Scanner;
public class Entrada {
   static Scanner entrada = new Scanner(System.in);

   public static byte leerByte(String mensaje) {
       //byte data = 0;
       boolean validacion = false;
        byte data = 0;
       do {

           try
           {
               System.out.println(mensaje);
               data = entrada.nextByte();
               entrada.nextLine();
               validacion = true;
           }
           catch (InputMismatchException e){
               System.err.println("formato invalido, tira otra vez!");
               entrada.nextLine();
           }
       }while (!validacion);
       return data;
   }
   public static int leerInt(String mensaje) {
       int data = 0;
       boolean validacion = false;
       do {
           try
               {
                   System.out.println("edad int " + mensaje);
                   data = entrada.nextInt();
                   validacion = true;
               }
           catch (InputMismatchException e){
               System.err.println("InputMismatchException format: el formato ha de ser un int");
               entrada.nextLine();
           }

       }while (!validacion);
       return data;
   }
   public static float leerFloat(String mensaje) {
       float data = 0;
       boolean validacion = false;

       do {

       try {
           System.out.println("esto es un float " +mensaje);
           data = entrada.nextFloat();
           validacion = true;
       }catch (InputMismatchException e) {
           System.err.println("InputMismatchException format: el formato ha de ser un float");
           entrada.nextLine();
       }
       }while (!validacion);
       return data;
   }
   public static double leerDouble(String mensaje) {
       double data = 0.0;
       boolean validacion = false;
       do {

       try {
           System.out.println(mensaje);
           data = entrada.nextDouble();
           validacion = true;
       }catch (InputMismatchException e) {
           System.err.println("InputMismatchException format" + e.getMessage());
       }
       }while (!validacion);

       return data;
   }

   //Mètodes a implantar capturant l’excepció de la classe Exception:

    public static char leerChar(String mensaje) throws InputInvalidException {
       char data;
       boolean validacion = false;

       try {
           System.out.println(mensaje);
           data = (char) entrada.nextShort();
           validacion = true;
       }catch (Exception e){
           throw new InputInvalidException("Error de formato");
       }
    return data;
    }
    public static String leerString(String mensaje) throws InputInvalidException {
       String data;
       boolean validacion = false;

       try {
           System.out.println(mensaje);
           data = entrada.nextLine();
           validacion = true;
       }catch (Exception e){
           throw new InputInvalidException("Error de formato");
       }
       return data;
    }
}
