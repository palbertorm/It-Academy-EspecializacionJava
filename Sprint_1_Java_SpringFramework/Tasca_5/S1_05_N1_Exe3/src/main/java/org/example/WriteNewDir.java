package org.example;

import org.apache.commons.io.comparator.NameFileComparator;
import org.apache.commons.io.output.FileWriterWithEncoding;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class WriteNewDir {
    public void ordenarDirectorio(String directorioName) {
        File directorio = new File(directorioName);
        File[] archivos = directorio.listFiles();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        if (archivos != null) {
            NameFileComparator comparator = new NameFileComparator();
            comparator.sort(archivos);
            try {
                for (File archivo : archivos) {
                    String dirOrCarpeta = archivo.isDirectory() ? "Carpeta " : "Archivo ";
                    File file = new File("../my-file.txt");
                        try (FileWriterWithEncoding writer = new FileWriterWithEncoding(file, "UTF-8", true)) {// append true avoid
                            writer.write(archivo.getName() + " " + dirOrCarpeta + sdf.format(archivo.lastModified()));
                            writer.close();
                        }
                    if (archivo.isDirectory()) {
                        ordenarDirectorio(archivo.getAbsolutePath());
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        } else {
            throw new SecurityException("Error : " + directorioName);
        }
    }
}
