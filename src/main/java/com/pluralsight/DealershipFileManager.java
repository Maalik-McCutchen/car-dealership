package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

public class DealershipFileManager {

    public Dealership getDealership(String fileName) {

        Dealership dealership = null;

        try {

            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();

            String[] tokens = line.split("\\|");

            String name = tokens[0];
            String address = tokens[1];
            String phone = tokens[2];

            dealership = new Dealership(name, address, phone);


            while ((line = reader.readLine()) != null) {

                String[] vehicleTokens = line.split("\\|");

                int vin = Integer.parseInt(vehicleTokens[0]);
                int year = Integer.parseInt(vehicleTokens[1]);
                String make = vehicleTokens[2];
                String model = vehicleTokens[3];
                String vehicleType = vehicleTokens[4];
                String color = vehicleTokens[5];
                int odometer = Integer.parseInt(vehicleTokens[6]);
                BigDecimal price = new BigDecimal(vehicleTokens[7]);

                Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);

                dealership.addVehicle(vehicle);
            }

            reader.close();

        } catch (Exception e) {
            System.err.println("Something went wrong.");
        }

        return dealership;
    }

    public void saveDealership(Dealership dealership) {

        try {
            FileWriter writer = new FileWriter("inventory.csv", false );

            String dealershipInfo = dealership.getName() + "|" + dealership.getAddress() + "|" + dealership.getPhone();

            writer.write(dealershipInfo);
            writer.write("\n");

            for (Vehicle vehicle : dealership.getAllVehicles()) {

                String vehicleInfo = vehicle.getVin() + "|" + vehicle.getYear() + "|" + vehicle.getMake() + "|" + vehicle.getModel() + "|" +
                        vehicle.getVehicleType() + "|" + vehicle.getColor() + "|" + vehicle.getOdometer() + "|" + vehicle.getPrice();

                writer.write(vehicleInfo);
                writer.write("\n");

            }

            writer.close();

        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

    }

}
