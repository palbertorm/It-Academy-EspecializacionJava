import java.util.ArrayList;

public class Basketball extends Noticia implements CalculoNoticia, CalculoPuntos {
    private String competicion;
    private String club;

    public Basketball(String competicion, String club) {
        this.competicion = competicion;
        this.club = club;
    }

    public Basketball(String titular, int puntuacion, int precio, String competicion, String club) {
        super(titular, puntuacion, precio);
        this.competicion = competicion;
        this.club = club;
    }

    public Basketball(String titular, int puntuacion, int precio) {
        super(titular, puntuacion, precio);

    }

    public String getCompeticion() {
        return competicion;
    }

    public void setCompeticion(String competicion) {
        this.competicion = competicion;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
    public  static int calcularPreuNoticia(int puntuacion, int precio) {
        return puntuacion * precio;
    }
    public void calcularNoticia() {

    }
    public int calcularPuntuacion() {
        return 0;
    }

    @Override
    public String toString() {
        return "Basketball{" +
                "competicion='" + competicion + '\'' +
                ", club='" + club + '\'' +
                '}';
    }
}
