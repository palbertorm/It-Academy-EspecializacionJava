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
               System.out.println("edad debe de ser  un byte... " + mensaje);
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
                   System.out.println("edad debe de ser int... " + mensaje);
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
           System.out.println("esto es un doble " + mensaje);
           data = entrada.nextDouble();
           entrada.nextLine();
           validacion = true;
       }catch (InputMismatchException e) {
           System.err.println("InputMismatchException format: el formato ha de ser doble ");
           entrada.nextLine();
       }
       }while (!validacion);

       return data;
   }

   //Mètodes a implantar capturant l’excepció de la classe Exception:

    public static char[] leerChar(String mensaje) throws InputInvalidException {
       char[] data = new char[0];
       boolean validacion = false;
        do{
            try {

            System.out.println("esto es un char " + mensaje);
            //String input = mensaje.substring(1);
            String input = entrada.nextLine().trim();
            if (input.length() == 1) {
            data = input.toCharArray();
            validacion = true;

            }
            /*else {
                System.err.println("Error: Ingresa solo una let");

            }*/
            }catch (Exception e){
                //System.err.println("Error: Ingresa solo una let" +e.getMessage());
                throw new InputInvalidException("rererere" +e.getMessage());
            }
        }while (!validacion);
        return data;
    }
    public static String leerString(String mensaje) throws Exception {
       String data="";
       boolean validacion = false;
        do{
            System.out.println("esto es un String " + mensaje);
            try {
            data = entrada.nextLine();
            validacion = true;
            }catch (Exception e){
                System.err.println("Error: Ingresa solo una letra" + e.getMessage());
            }

        }while (!validacion);
        return data;
    }
    public static boolean lerSiNo(String mensaje) throws Exception {
        boolean data = false;
        boolean validacion = false;
        do{
            try {
            System.out.println("esto es un Boolean dime 'si' o 'no' " );
            String input = entrada.nextLine().trim();
            //input.equalsIgnoreCase("si") | input.equalsIgnoreCase("s")
            if (input.startsWith("s")){
                data = true;
                validacion = true;
                System.out.println("esto es un true ");
            } else if (input.startsWith("n")) {
                validacion = true;
                System.out.println("esto es un false");
            }else {
                System.err.println("debe empezar con S o N");
            }

            }catch ( Exception e){
                System.err.println("Error: Ingresa solo " + e.getMessage());
            }

        }while (!validacion);
        return data;
    }
}
