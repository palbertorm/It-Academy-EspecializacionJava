import java.util.ArrayList;
import java.util.List;

public abstract class NPC {
    private String nombre;
    private String ciudad;
    private static List<Item> items = new ArrayList<>();

    public NPC(String nombre, String ciudad, List<Item> items) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.items = items;
    }public NPC(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.items = items;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addItem(Item item) {
        items.add(item);
    }
}
