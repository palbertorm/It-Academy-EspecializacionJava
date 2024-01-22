package org.example;

import org.apache.commons.io.input.ReaderInputStream;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;

public class ListaFichero {
    public void LerFichero (String pathName){
//        CharsetEncoder encoder = StandardCharsets.UTF_8.newEncoder();
        File file = new File(pathName);
        try (BufferedReader reader = new BufferedReader(new FileReader(file));){

            String line;
            while((line = reader.readLine())!=null){
                System.out.println(line);

            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
