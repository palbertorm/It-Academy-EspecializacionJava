import java.util.ArrayList;

public class Noticia{
    private String titular;
    private int puntuacion;
    private int precio;

    public Noticia( String titular, int puntuacion, int precio) {

        this.titular = titular;
        this.puntuacion = puntuacion;
        this.precio = precio;
    }

    public Noticia() {

    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
