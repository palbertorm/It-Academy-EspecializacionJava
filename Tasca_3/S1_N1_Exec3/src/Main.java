import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.*;

import static java.lang.Math.random;

public class Main {
        static Map<String, String> map = new HashMap<String, String>();
        static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String nombreUser= "";
        String capitalUser= "";


        System.out.println("Dime tu nombre");
        nombreUser = input.next();
        System.out.println("Hola  "+ nombreUser);
        System.out.println("introduce el nombre de la capital " + lerArquivo());
        capitalUser = input.next().toLowerCase();
        addCapital(capitalUser);
    }
    public static String lerArquivo(){
        File countries = new File("../countries.txt");
        Scanner myReader = null;
        try {
            //BufferedReader reader = new BufferedReader(new FileReader( countries));
            myReader = new Scanner(countries);
        String line = myReader.nextLine().toLowerCase();
            while (myReader.hasNextLine()) {
                String[] data = myReader.nextLine().toLowerCase().split("\\s");
                String key = data[0].trim();
                String value = data[1];
                map.put(key, value);
            }
        } catch (IOException e) {
            System.out.println("Error 35: " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            myReader.close();
        }
        Object[] countryKey = map.keySet().toArray();
        Object key = countryKey[new Random().nextInt(countryKey.length)];

        return (String) key;
    }
    public static void addCapital(String nameCapital) {
        HashSet<String> capitals = new HashSet<String>();

        for (int i = 0; i < 3; i++) {
            System.out.println(" de " + lerArquivo());
            nameCapital = input.next().toLowerCase();
            if (map.containsValue(nameCapital)) {

            capitals.add(nameCapital);
            };
            System.out.println(capitals.size());
        }
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("../classificacion.txt"));
            for (String name : capitals){
                writer.write("\n " + name);

            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
        }


    }
}