public class Main {
    public static void main(String[] args) {
        Viento viento1 = new Viento("Trompeta", 100);
        Cuerdas cuerdas1 = new Cuerdas("Bajo", 580);
        Percusion percusion1 = new Percusion("Percusión", 1000);
        viento1.toque();
        cuerdas1.toque();
        percusion1.toque();

    }
}