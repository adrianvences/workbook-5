package com.pluralsight.car.dealership;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ContractFileManager {

public void saveContract(Contract contract) {
        try  {
            File file = new File("src/main/resources/Data/contracts.csv");
            boolean isNewFile = !file.exists() || file.length() == 0;
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter buffWriter = new BufferedWriter(fileWriter);

            // Write dealership info
            buffWriter.write( contract.getName() + "|" + contract.getAddress() + "|" + contract.getPhoneNumber());
            buffWriter.newLine();

            // Write vehicles
            for (Vehicle vehicle : contract.getAllVehicles()) {
                buffWriter.write(vehicle.getVin() + "|" +
                        contract.getYear() + "|" +
                        contract.getMake() + "|" +
                        contract.getModel() + "|" +
                        contract.getVehicleType() + "|" +
                        contract.getColor() + "|" +
                        contract.getOdometer() + "|" +
                        contract.getPrice());
                buffWriter.newLine();
            }
            buffWriter.close();
        } catch (IOException e) {
            System.out.println("Error saving contract to file");
            e.printStackTrace();
        }


    }

}


