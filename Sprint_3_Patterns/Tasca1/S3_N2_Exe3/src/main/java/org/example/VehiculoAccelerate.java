package org.example;

public class VehiculoAccelerate implements Order{
    private Vehiculo vehiculo;

    public VehiculoAccelerate(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }

    @Override
    public void execute() {
        vehiculo.accelerate();
    }
}
