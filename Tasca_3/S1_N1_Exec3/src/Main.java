import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.*;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombreUser= "";
        String capitalUser= "";


        System.out.println("Dime tu nombre");
        nombreUser = input.next();
        System.out.println("Hola  "+ nombreUser);
        openFile.addCapital(nombreUser);
        System.out.println("ENHORABUENA! has tenido " + openFile.puntuacion() + " aciertos");
    }

}