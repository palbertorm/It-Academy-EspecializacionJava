package org.example;

public class Vehiculo {

    private String name = "Ibiza";

    public void accelerate() {
        System.out.println(" this " + name + " is acceleration");
    }
    public void breaks() {
        System.out.println(" this " + name + " breaks");

    }
    public void pluck() {
        System.out.println(" this " + name + "plucks");
    }

    //TODO: CREATE CHILDREN CLASS (CAR, BUS AND ETC)
}
