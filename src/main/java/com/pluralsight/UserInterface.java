package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;


    public UserInterface () {

    }

    private void init() {
        DealershipFileManager dealershipFileManager = new DealershipFileManager();

        this.dealership = dealershipFileManager.getDealership("inventory.csv");

    }

    public void display () {
        init();

        Scanner myScanner = new Scanner(System.in);

        boolean running = true;

                while (running) {
                    System.out.println(dealership.getName());
                    System.out.println("1 - Find vehicles within a price range");
                    System.out.println("2 - Find vehicles by make / model");
                    System.out.println("3 - Find vehicles by year range");
                    System.out.println("4 - Find vehicles by color");
                    System.out.println("5 - Find vehicles by mileage range");
                    System.out.println("6 - Find vehicles by type (car, truck, SUV, van)");
                    System.out.println("7 - List ALL vehicles");
                    System.out.println("8 - Add a vehicle");
                    System.out.println("9 - Remove a vehicle");
                    System.out.println("99 - Quit");
                    System.out.println();

                    System.out.print("Command: ");
                    int command = myScanner.nextInt();

                    switch (command) {
                        case 1: processGetByPriceRequest();
                            break;

                        case 2: processGetByMakeModelRequest();
                            break;

                        case 3: processGetByYearRequest();
                            break;

                        case 4: processGetByColorRequest();
                            break;

                        case 5: processGetByMileageRequest();
                            break;

                        case 6: processGetByVehicleTypeRequest();
                            break;

                        case 7: processGetAllVehiclesRequest();
                            break;

                        case 8: processAddVehicleRequest();
                            break;

                        case 9: processRemoveVehicleRequest();
                            break;

                        case 99: running = false;
                            break;

                        default:
                            System.out.println("Invalid command");
                    }
                }

    }

    private void displayVehicles(ArrayList<Vehicle> vehicles) {

            for (Vehicle vehicle : vehicles) {

                System.out.println(vehicle);
            }

    }

    private void processGetByPriceRequest() {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter minimum price: ");
        BigDecimal minPrice = myScanner.nextBigDecimal();

        System.out.print("Enter maximum price: ");
        BigDecimal maxPrice = myScanner.nextBigDecimal();

        ArrayList<Vehicle> vehicles = dealership.getVehiclesByPrice(minPrice, maxPrice);
        displayVehicles(vehicles);


    }

    private void processGetByMakeModelRequest() {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter vehicle make: ");
        String make = myScanner.nextLine();

        System.out.print("Enter vehicle model: ");
        String model = myScanner.nextLine();

        ArrayList<Vehicle> vehicles = dealership.getVehiclesByMakeModel(make, model);
        displayVehicles(vehicles);



    }

    private void processGetByYearRequest() {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter minimum year: ");
        int minYear = myScanner.nextInt();

        System.out.print("Enter maximum year: ");
        int maxYear = myScanner.nextInt();

        ArrayList<Vehicle> vehicles = dealership.getVehiclesByYear(minYear, maxYear);
        displayVehicles(vehicles);

    }

    private void processGetByColorRequest() {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter color: ");
        String color = myScanner.nextLine();

        ArrayList<Vehicle> vehicles = dealership.getVehiclesByColor(color);
        displayVehicles(vehicles);

    }

    private void processGetByMileageRequest() {

    }

    private void processGetByVehicleTypeRequest() {

    }

    private void processGetAllVehiclesRequest() {

        ArrayList<Vehicle> vehicles = dealership.getAllVehicles();
        displayVehicles(vehicles);

    }

    private void processAddVehicleRequest() {

    }

    private void processRemoveVehicleRequest() {

    }


}
