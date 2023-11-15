import java.util.ArrayList;

public class Motociclismo extends Noticia{
    String equipo;

    public Motociclismo(String titular, int puntuacion, int precio) {
        super(titular, puntuacion, precio);
    }

    public Motociclismo(String equipo) {
        this.equipo = equipo;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Motociclismo{" +
                "equipo='" + equipo + '\'' +
                '}';
    }
}
