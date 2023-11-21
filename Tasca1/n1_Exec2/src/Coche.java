public class Coche {
    final static String marca = "Seat";
    public static String modelo;
    final private  int potencia;

    public Coche( int potencia ) {
        this.potencia = potencia;
    }

    public static void frenar(String modelo) {
        System.out.println(" el vehiculo del " + modelo + " está frenando" );
    }
    public void acelerar(){
        System.out.println(" el vehiculo está acelerando con la potencia de " + potencia + " cv" );
    }
}
