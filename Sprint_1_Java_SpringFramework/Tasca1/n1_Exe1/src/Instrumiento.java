abstract class Instrumiento {
    private String nombre;
    private int precio;

    public Instrumiento(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    void toque() {
        System.out.println("Está tocando el " + nombre+ " con el precio de " + precio + " eu");
    }
}
