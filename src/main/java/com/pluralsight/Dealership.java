package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class Dealership {

    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone){
        inventory = new ArrayList<>();
        this.name = name;
        this.address = address;
        this.phone = phone;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Vehicle> getVehiclesByPrice(BigDecimal minPrice, BigDecimal maxPrice) {
        ArrayList<Vehicle> filterVehicle = new ArrayList<>();

        for (Vehicle vehicle : inventory) {

            BigDecimal price = vehicle.getPrice();

            if (price.compareTo(minPrice) >= 0 && price.compareTo(maxPrice) <= 0) {
                filterVehicle.add(vehicle);
            }

        }
        return filterVehicle;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel (String make, String model) {
        ArrayList<Vehicle> filterVehicle = new ArrayList<>();

        for (Vehicle vehicle : inventory) {

            String vehicleMake = vehicle.getMake();
            String vehicleModel = vehicle.getModel();

            if (vehicleMake.equalsIgnoreCase(make) && vehicleModel.equalsIgnoreCase(model)) {
                filterVehicle.add(vehicle);
            }

        }
            return filterVehicle;
    }

    public ArrayList<Vehicle> getVehiclesByYear (int minYear, int maxYear) {
        ArrayList<Vehicle> filterVehicle = new ArrayList<>();

        for (Vehicle vehicle : inventory) {

            int vehicleYear = vehicle.getYear();

            if (vehicleYear >= minYear && vehicleYear <= maxYear) {
                filterVehicle.add(vehicle);
            }
        }

            return filterVehicle;
    }

    public ArrayList<Vehicle> getVehiclesByColor (String color) {
        ArrayList<Vehicle> filterVehicle = new ArrayList<>();

        for (Vehicle vehicle : inventory) {

            String vehicleColor = vehicle.getColor();

            if (vehicleColor.equalsIgnoreCase(color)) {
                filterVehicle.add(vehicle);

            }
        }
            return filterVehicle;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int minMileage, int maxMileage) {
        ArrayList<Vehicle> filterVehicle = new ArrayList<>();

        for (Vehicle vehicle : inventory) {

            int mileage = vehicle.getOdometer();

            if (mileage >= minMileage && mileage <= maxMileage) {
                filterVehicle.add(vehicle);
            }
        }
            return filterVehicle;
    }

    public ArrayList<Vehicle> getVehiclesByType (String vehicleType) {
        ArrayList<Vehicle> filterVehicle = new ArrayList<>();

        for (Vehicle vehicle : inventory) {

            String type = vehicle.getVehicleType();

            if (type.equalsIgnoreCase(vehicleType)) {
                filterVehicle.add(vehicle);
            }
        }
        return filterVehicle;
    }

    public ArrayList<Vehicle> getAllVehicles() {
            return inventory;
    }

    public void addVehicle(Vehicle addCar) {
        inventory.add(addCar);
    }

    public void removeVehicle(Vehicle removeCar) {
        inventory.remove(removeCar);
    }

}
