package com.pluralsight.inheritance.exercise;

public class SemiTruck extends Vehicle {
    private boolean hasTrailer;


    public SemiTruck(String make, String model, int year, int numberOfSeats,boolean hasTrailer) {
        super(make, model, year, numberOfSeats);
        this.hasTrailer = hasTrailer;
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }
}
