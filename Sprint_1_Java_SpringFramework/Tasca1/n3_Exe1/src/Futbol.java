public class Futbol extends Noticia implements CalculoNoticia, CalculoPuntos{
    private String competicion;
    private String club;
    private String jugador;

    public Futbol( String titular, int puntuacion, int precio, String competicion, String club, String jugador) {
        super( titular, puntuacion, precio);
        this.competicion = competicion;
        this.club = club;
        this.jugador = jugador;
    }

    public Futbol(String competicion, String club, String jugador) {
        super();
    this.competicion = competicion;
    this.club = club;
    this.jugador = jugador;
    }


    public String getCompeticion() {
        return competicion;
    }

    public void setCompeticion(String nombre) {
        this.competicion = nombre;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }
    public void calcularNoticia() {
    int preu = getPrecio() * 6;
    }
//    public void calcularPuntuacion() {
//        return 0;
//    }

    @Override
    public String toString() {
        return "Futbol{" +
                "competicion='" + competicion + '\'' +
                ", club='" + club + '\'' +
                ", jugador='" + jugador + '\'' +
                '}';
    }
}
