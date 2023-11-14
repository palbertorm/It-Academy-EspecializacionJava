public class Smartphone extends Telefono implements Camara, Reloj {
    public Smartphone(String marca, String model) {
        super(marca, model);
    }

    @Override
    public String fotografiar() {
        return "Se está haciendo fotografía";
    }
    public String alarmar() {
        return "Se está sonando la alarma";
    }
}
