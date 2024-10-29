package com.pluralsight.inheritance.exercise;

public class HoverCraft extends Vehicle {
    private double hoverHeight;


    public HoverCraft(String make, String model, int year, int numberOfSeats,double hoverHeight) {
        super(make, model, year, numberOfSeats);
        this.hoverHeight = hoverHeight;
    }

    public double getHoverHeight() {
        return hoverHeight;
    }
}
