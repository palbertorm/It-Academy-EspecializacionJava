import java.util.ArrayList;

public class Redactor {
    private String nombre;
    final private String dni;

    final static float sueldo = 1.500F;
    ArrayList<Noticia> noticias;

    public Redactor(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.noticias = new ArrayList<Noticia>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public ArrayList<Noticia> getNoticias() {
        return noticias;
    }

    public void setNoticias(ArrayList<Noticia> noticias) {
        this.noticias = noticias;
    }
}
