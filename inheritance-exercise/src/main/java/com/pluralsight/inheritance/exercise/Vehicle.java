package com.pluralsight.inheritance.exercise;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private int numberOfSeats;

    public Vehicle(String make, String model, int year, int numberOfSeats) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.numberOfSeats = numberOfSeats;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}
