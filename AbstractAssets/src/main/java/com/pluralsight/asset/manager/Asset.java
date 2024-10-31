package com.pluralsight.asset.manager;

import java.util.ArrayList;

public abstract class Asset {
    private String description;
    private String dateAcquired;
    private double originalCost;

    public Asset(String description, String dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

    public abstract double getValue();

    public void addAsset(Asset a, ArrayList<Asset> list){
        System.out.println("Asset added");
        list.add(a);
    }

    @Override
    public String toString(){
        return "description: " + getDescription() + " , Date acquired: " + getDateAcquired() + " ,Paid : " + getOriginalCost();
    }


}
