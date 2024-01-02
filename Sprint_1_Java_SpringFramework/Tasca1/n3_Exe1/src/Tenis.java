public class Tenis extends Noticia implements CalculoNoticia, CalculoPuntos {
    private String competicion;
    private String tenista;

    public Tenis(String titular, int puntuacion, int precio, String competicion, String tenista) {
        super(titular, puntuacion, precio);
        this.competicion = competicion;
        this.tenista = tenista;
    }

    public Tenis(String competicion, String tenista) {
        super();
        this.competicion = competicion;
        this.tenista = tenista;
    }

    public String getCompeticion() {
        return competicion;
    }

    public void setCompeticion(String competicion) {
        this.competicion = competicion;
    }

    public String getTenista() {
        return tenista;
    }

    public void setTenista(String tenista) {
        this.tenista = tenista;
    }
    public void calcularNoticia() {

    }
    public void calcularPuntuacion() {
        return 0;
    }

    @Override
    public String toString() {
        return "Tenis{" +
                "competicion='" + competicion + '\'' +
                ", tenista='" + tenista + '\'' +
                '}';
    }
}
