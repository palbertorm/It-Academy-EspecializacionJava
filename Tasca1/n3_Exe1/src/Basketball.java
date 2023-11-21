public class Basketball extends Noticia implements CalculoNoticia, CalculoPuntos {
    static  String competicion;
    static  String club;

    public Basketball(String competicion, String club) {
        super();
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
    public void calcularNoticia() {

    }
    public void calcularPuntuacion() {
        if (getCompeticion().equalsIgnoreCase("liga")){
            setPuntuacion(+3);
        }
        if (getCompeticion().equalsIgnoreCase("acb")){
            setPuntuacion(+1);
        } else if (getClub().equalsIgnoreCase("barcelona") | getClub().equalsIgnoreCase("madrid")) {
            setPuntuacion(+1);
        }

    }

    @Override
    public String toString() {
        return "Basketball{" +
                "competicion='" + competicion + '\'' +
                ", club='" + club + '\'' +
                '}';
    }
}
