import java.util.List;

public class Campesino  extends NPC implements Impuesto{
    private double precioOriginal;


    public Campesino(String nombre, String ciudad, double precioOriginal) {
        super(nombre, ciudad);
        this.precioOriginal = precioOriginal;
    }

    public double getPrecioOriginal() {
        return precioOriginal;
    }

    public void setPrecioOriginal(double precioOriginal) {
        this.precioOriginal = precioOriginal;
    }

    @Override
    public void calcularImpuesto() {
        precioOriginal *= (2 / 100);
    }
}
