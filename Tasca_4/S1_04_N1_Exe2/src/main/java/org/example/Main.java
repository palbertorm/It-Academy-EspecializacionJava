package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String nombreDni;
        int numDni = 0;
        //ArrayList<CalculoDni> dniList = new ArrayList<CalculoDni>();
        System.out.println("dime tu nombre");
        nombreDni = input.next();
        System.out.println("dime solo tu numeros del dni");
        numDni = input.nextInt();
        CalculoDni calculoDni = new CalculoDni(numDni, nombreDni);
        // TODO variable will change for object value from class
       char letraDni = calculoDni.compruebaDni(numDni);
        System.out.println("tu letra de dni es: "+  letraDni);
        /*
        *
    Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre el número com a paràmetre.
    Crea una classe jUnit que verifiqui el seu correcte funcionament, parametritzant-la perquè el test rebi un espectre de dades ampli i validi si el càlcul és correcte per a 10 números de DNI predefinits.
*/
    }
}