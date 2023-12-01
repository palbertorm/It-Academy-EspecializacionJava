package org.example;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.comparator.CompositeFileComparator;
import org.apache.commons.io.comparator.NameFileComparator;
import java.io.File;
import java.util.Comparator;

public class ListaDirectorio {

    public void ordenarDirectorio(String directorioName){
            File directorio = new File(directorioName);
            File[] archivos = directorio.listFiles();
        try{
            CompositeFileComparator comparator = new CompositeFileComparator();
            comparator.sort(archivos);

        }catch (SecurityException e) {
            e.printStackTrace();
        }
    }
 /*   @Override
    public int compare(File file1, File file2) {
        return file1.getName().toLowerCase().compareTo(file2.getName().toLowerCase());
    }*/
}
