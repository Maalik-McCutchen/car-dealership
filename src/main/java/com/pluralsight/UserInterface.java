package com.pluralsight;

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


    }


}
