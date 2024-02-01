package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        CarAccelerate carAccelerate = new CarAccelerate(car);

        Parking parking = new Parking();
        parking.takeOrder(carAccelerate);
        parking.putOrder(carAccelerate);
    }
}