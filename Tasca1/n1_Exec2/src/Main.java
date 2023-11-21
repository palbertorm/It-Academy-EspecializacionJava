public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche( 220);
        coche1.acelerar();


        Coche.modelo = "Ferrari";
        Coche.frenar(Coche.modelo);

        /*
        * ¿Hay alguno que pueda inicializarse al constructor de la clase?
        * respuesta: */

    }
}