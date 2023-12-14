import java.io.*;
import java.util.*;

public class openFile {
    static Map<String, String> map = new HashMap<String, String>();
    static HashSet<String> capitals = new HashSet<String>();
    static Scanner input = new Scanner(System.in);
    public static String lerArquivo(){
        File countries = new File("../countries.txt");
        Scanner myReader = null;
        try {
            //BufferedReader reader = new BufferedReader(new FileReader( countries));
            myReader = new Scanner(countries);
            String line = myReader.nextLine().toLowerCase().replace("_", " ");
            while (myReader.hasNextLine()) {

                String[] data = myReader.nextLine().toLowerCase().split("\\s");
                String key = data[0].trim();
                String value = data[1];
                value.replace("_", " ");
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
    public static void addCapital(String name) {

        HashMap<String, Integer> clasificaciones = new HashMap<String, Integer>();
        BufferedReader reader = null;
        BufferedWriter writer = null;
        String nameCapital = "";
        int puntos = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println(" introduce el nombre de la capital de " + lerArquivo());
            nameCapital = input.next().toLowerCase();
            if (map.containsValue(nameCapital)) {

                capitals.add(nameCapital);
            }
            ;
            puntos = capitals.size();
        }
        clasificaciones.put(name, puntos);
//        System.out.println("ENHORABUENA! has tenido " + puntos + " acertos");
        try {
            writer = new BufferedWriter(new FileWriter("../classificacion.txt"));
            for (Map.Entry<String, Integer> line : clasificaciones.entrySet()) {
//                line.toString().split(",");
                writer.write(line.getKey() + ":" + line.getValue());
                writer.newLine();

            }
            writer.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public static int puntuacion(){
        BufferedReader reader = null;
        int response = 0;
        try {
            reader = new BufferedReader(new FileReader("../classificacion.txt"));
            String line;
            while ((line = reader.readLine()) != null){

                String[] str =line.split(":");
                response = Integer.parseInt(str[1]);


            }
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();;
        }
        return response;
    }
}
