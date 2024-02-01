package org.example;

public class CarAccelerate implements Order{
    private Car car;

    public CarAccelerate(Car car){
        this.car = car;
    }

    @Override
    public void execute() {
        car.accelerate();
    }
}
