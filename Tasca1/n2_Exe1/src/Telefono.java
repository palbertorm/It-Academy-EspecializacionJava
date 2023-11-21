public class Telefono {
    private String marca;
    private String model;

    public Telefono(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String llamar(int numeroTelefono) {
        return "Hola estás llamanado al " + numeroTelefono ;
    }
}
