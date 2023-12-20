package org.example;

import org.apache.commons.io.comparator.NameFileComparator;

import java.io.File;
import java.io.FileFilter;
import java.text.SimpleDateFormat;

public class ListarDirectorio {

    public void ordenarDirectorio(String directorioName) {
        FileFilter filtro = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile();
            }
        };
        File directorio = new File(directorioName);
        File[] archivos = directorio.listFiles();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        if (archivos != null) {
            NameFileComparator comparator = new NameFileComparator();
            comparator.sort(archivos);
            for (File archivo : archivos) {
                String dirOrCarpeta = archivo.isDirectory() ? "Carpeta " : "Archivo ";
                System.out.println(archivo.getName() + " " + dirOrCarpeta + sdf.format(archivo.lastModified()));
                if (archivo.isDirectory()) {
                    // TODO hacer una llamada recursiva
                    ordenarDirectorio(archivo.getAbsolutePath());
                }
            }


        } else {
            throw new SecurityException("Error : " + directorioName);
        }
    }
}


