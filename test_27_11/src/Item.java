public class Item {
    private String nombre;
    private  double precio;
    private  String tipo;
    private double porcentajeDesgaste;

    public Item(String nombre, double precio, String tipo, double porcentajeDesgaste) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
        double porcentajeDesgaste1 = this.porcentajeDesgaste;
    }

    public Item(String nombre, double precio, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
