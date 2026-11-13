package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

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
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel (String make, String model) {
            return null;
    }

    public ArrayList<Vehicle> getVehiclesByYear (int minYear, int maxYear) {
            return null;
    }

    public ArrayList<Vehicle> getVehiclesByColor (String color) {
            return null;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int minMileage, int maxMileage) {
            return null;
    }

    public ArrayList<Vehicle> getVehiclesByType (String vehicleType) {
        return null;
    }

    public ArrayList<Vehicle> getAllVehicles() {
            return inventory;
    }

    public void addVehicle(Vehicle addCar) {
        inventory.add(addCar);
    }

    public void removeVehicle(Vehicle removeCar) {

    }

}
