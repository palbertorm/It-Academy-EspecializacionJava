public class Redactor {
    private String nombre;
    final private int dni;

    final static float sueldo = 1.500F;

    public Redactor(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }
}
