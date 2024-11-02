package com.pluralsight.vehicles;

public class HoverCraft extends Vehicles{
    private double hoverHeight;


    public HoverCraft(String color, int numbersOfPassengers, int cargoCapacity, int fuelCapacity, double hoverHeight) {
        super(color, numbersOfPassengers, cargoCapacity, fuelCapacity);
        this.hoverHeight = hoverHeight;
    }
}
