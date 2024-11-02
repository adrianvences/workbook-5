package com.pluralsight.vehicles;

public class Vehicles {
    private String color;
    private int numbersOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;

    public Vehicles(String color, int numbersOfPassengers, int cargoCapacity, int fuelCapacity) {
        this.color = color;
        this.numbersOfPassengers = numbersOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumbersOfPassengers() {
        return numbersOfPassengers;
    }

    public void setNumbersOfPassengers(int numbersOfPassengers) {
        this.numbersOfPassengers = numbersOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
