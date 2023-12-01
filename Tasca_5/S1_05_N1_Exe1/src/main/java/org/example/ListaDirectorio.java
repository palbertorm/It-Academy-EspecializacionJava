package org.example;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class ListaDirectorio implements Comparator<File> {

    public void ordenarDirectorio(String directorioName){
        File directorio = new File(directorioName);
//        Path directorio = Path.of(directorioName);
//        List<File> archivos = List.of(Objects.requireNonNull(directorio.listFiles()));
        List<File> archivos = List.of(directorio.listFiles());
        Collections.sort(archivos, this);
    }
    @Override
    public int compare(File file1, File file2) {
        return file1.getName().toLowerCase().compareTo(file2.getName().toLowerCase());
    }
}
