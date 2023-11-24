import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File countries = new File("../countries.txt");
        Map<String, String> map = new HashMap<String, String>();
        Scanner myReader = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader( countries));
            myReader = new Scanner(countries);
//            while (myReader.hasNextLine()) {
//                String data = myReader.nextLine();
//                for (String linha: data.split("\\t")) {
//                    String line = linha.trim();
//                    line.replace(" ", "");
//                System.out.println(line);
//
//                }
//                //map.put(line[0], line[0]);
//            }
           while (reader.ready()) {
               String data = reader.readLine();
               System.out.println(data);
               data.getBytes(StandardCharsets.UTF_8);
               map.put(data, String.valueOf(data.length()));
//                String data = myReader.nextLine();
//                map.put(data , data.substring(0, data.length()));
           }
            System.out.println("mapeio" + map);
        } catch (IOException e) {
            System.out.println("Error 35: " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            myReader.close();
        }
    }
}