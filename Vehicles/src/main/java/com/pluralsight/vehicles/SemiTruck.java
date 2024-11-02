package com.pluralsight.vehicles;

public class SemiTruck extends Vehicles{
    private boolean hasTrailer;


    public SemiTruck(String color, int numbersOfPassengers, int cargoCapacity, int fuelCapacity, boolean hasTrailer) {
        super(color, numbersOfPassengers, cargoCapacity, fuelCapacity);
        this.hasTrailer = hasTrailer;
    }
}
