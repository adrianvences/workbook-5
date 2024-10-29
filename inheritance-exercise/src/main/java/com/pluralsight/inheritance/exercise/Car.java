package com.pluralsight.inheritance.exercise;

public class Car extends Vehicle{
    private int numberOfDoors;


    public Car(String make, String model, int year, int numberOfSeats,int numberOfDoors) {
        super(make, model, year,numberOfSeats);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
