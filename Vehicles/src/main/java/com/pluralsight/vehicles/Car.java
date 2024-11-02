package com.pluralsight.vehicles;

public class Car extends Vehicles{
    private int numberOfDoors;


    public Car(String color, int numbersOfPassengers, int cargoCapacity, int fuelCapacity, int numberOfDoors) {
        super(color, numbersOfPassengers, cargoCapacity, fuelCapacity);
        this.numberOfDoors = numberOfDoors;
    }
}
