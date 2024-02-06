package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class NPC {
    private String nombre;
    private String ciudad;
    Item item;

    public NPC(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//    public void addItem(Item item) {
//        item.add(item);
//    }
}

