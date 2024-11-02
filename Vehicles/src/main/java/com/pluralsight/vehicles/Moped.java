package com.pluralsight.vehicles;

public class Moped extends Vehicles{
    private boolean hasCarrier;

    public Moped(String color, int numbersOfPassengers, int cargoCapacity, int fuelCapacity, boolean hasCarrier) {
        super(color, numbersOfPassengers, cargoCapacity, fuelCapacity);
        this.hasCarrier = hasCarrier;
    }
}
