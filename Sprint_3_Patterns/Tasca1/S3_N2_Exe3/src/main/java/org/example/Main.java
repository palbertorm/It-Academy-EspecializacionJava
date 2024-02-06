package org.example;

public class Main {
    public static void main(String[] args) {
        Vehiculo car = new Vehiculo();

        VehiculoAccelerate carAccelerate = new VehiculoAccelerate(car);

        Parking parking = new Parking();
        parking.takeOrder(carAccelerate);
        parking.putOrder();
    }
}