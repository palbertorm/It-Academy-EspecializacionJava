import java.util.ArrayList;

public class Formula1 extends Noticia{
    private String escuderia;

    public Formula1(String titular, int puntuacion, int precio, String escuderia) {
        super(titular, puntuacion, precio);
        this.escuderia = escuderia;
    }

    public Formula1(String escuderia) {
        super();
        this.escuderia = escuderia;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    @Override
    public String toString() {
        return "Formula1{" +
                "escuderia='" + escuderia + '\'' +
                '}';
    }
}
