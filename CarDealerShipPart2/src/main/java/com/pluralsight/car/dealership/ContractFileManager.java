package com.pluralsight.car.dealership;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ContractFileManager {

public void saveContract(Contract contract) {
//        try  {
            System.out.println(contract);
//            File file = new File("src/main/resources/Data/contracts.csv");
//            boolean isNewFile = !file.exists() || file.length() == 0;
//            FileWriter fileWriter = new FileWriter(file);
//            BufferedWriter buffWriter = new BufferedWriter(fileWriter);
//
//            // Write dealership info
////            buffWriter.write( contract.getName() + "|" + contract.getAddress() + "|" + contract.getPhoneNumber());
////            buffWriter.newLine();
//            if
//            // Write vehicles
//            for (Contract c : contract.getAllVehicles()) {
//                buffWriter.write(vehicle.getVin() + "|" +
//                        c.getYear() + "|" +
//                        c.getMake() + "|" +
//                        c.getModel() + "|" +
//                        c.getVehicleType() + "|" +
//                        c.getColor() + "|" +
//                        c.getOdometer() + "|" +
//                        c.getPrice());
//                buffWriter.newLine();

//            buffWriter.close();
//        } catch (IOException e) {
//            System.out.println("Error saving contract to file");
//            e.printStackTrace();
//        }


    }

    public static Contract makeContract(String contractType, Vehicle vehicle){
        if( contractType.equalsIgnoreCase("saleContract")){
            String date = UserInterface.promptMethod("Please Enter Date YYYY/MM/dd: ");
            String customerName = UserInterface.promptMethod("Please Enter Full Name: ");
            String customerEmail = UserInterface.promptMethod("Please enter email: ");
            String vehicleSold = vehicle.toString();
            double vehiclePrice = vehicle.getPrice();
            boolean financing = isFinancingPrompt();
            SalesContract newSC = new SalesContract(date,customerName,customerEmail,vehicleSold,vehiclePrice,financing);
            System.out.println(newSC);
            return newSC;
        }
        else{
            String date = UserInterface.promptMethod("Please Enter Date YYYY/MM/dd: ");
            String customerName = UserInterface.promptMethod("Please Enter Full Name: ");
            String customerEmail = UserInterface.promptMethod("Please enter email: ");
            String vehicleSold = vehicle.toString();
            double vehiclePrice = vehicle.getPrice();
            LeaseContract newLC = new LeaseContract(date,customerName,customerEmail,vehicleSold,vehiclePrice);
            return newLC;
        }

    }

    public static boolean isFinancingPrompt(){

        boolean isFinancing = false;
        boolean validInput = false;

        while(!validInput) {
            String input = UserInterface.promptMethod("""
                    Will you be financing?
                    Type 'Y' for yes or 'N' for no:
                    """);
            if (input.equalsIgnoreCase("n")) {
                validInput = true;
            } else if (input.equalsIgnoreCase("y")) {
                isFinancing = true;
                validInput = true;
            } else {
                System.out.println("Please enter a valid option.");
            }
        }
        return isFinancing;
    }

    }




