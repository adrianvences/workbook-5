package com.pluralsight.asset.manager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        House myHouse = new House("Main house","1/1/12", 300000.00, "123 lane", 1,1000,1000);
        House xiomarsHouseHouse = new House("xiomaras house","1/1/12", 300000.00, "123 lane", 1,1000,1000);
        Vehicle myCar = new Vehicle("ford","1/1/12",17500,"f150",2016,101000);
        Vehicle xioCar = new Vehicle("toyota","1/1/12",17500,"f150",2016,101000);

        myHouse.addAsset(myHouse,assets);
        xiomarsHouseHouse.addAsset(xiomarsHouseHouse,assets);
        myCar.addAsset(myCar,assets);
        xioCar.addAsset(xioCar,assets);

        for (Asset a : assets){
            System.out.println(a);
            if( a instanceof Vehicle){
                System.out.println("Make/Model" + ((Vehicle) a).getMakeModel());
            }
            if(a instanceof House){

                // here i down cast "a" to tell the compiler that a is indeed a house
                System.out.println("Address: " + ((House) a).getAddress());
            }
        }

    }

    public void addAsset(Asset a, ArrayList<Asset> list){
        System.out.println("Asset added");
        list.add(a);
    }
}
