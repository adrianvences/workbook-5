package com.pluralsight.inheritance.exercise;

public class Moped extends Vehicle {
    private boolean hasCarrier;


    public Moped(String make, String model, int year, int numberOfSeats,boolean hasCarrier) {
        super(make, model, year, numberOfSeats);
        this.hasCarrier = hasCarrier;
    }

    public boolean isHasCarrier() {
        return hasCarrier;
    }
}
