package com.careerdevs.carrentalapp;

public class RentalService {
    public static void main(String[] args) {
        System.out.println("Welcome to the Java Car Rental App");

        // we could use traditional / standard array
        Car[] carStorage = new Car[3];

        Car car1 = new Car("Honda", "accord", false);
        Car car2 = new Car("Chevy", "Cruze", false);
        Car car3 = new Car("Toyota", "Corolla", false);

        // or we could use Array list
        carStorage[0] = car1;
        carStorage[1] = car2;
        carStorage[2] = car3;

        // problem: how do we list just the available cars

        //solution: (std arr); iterate through array, only display available cars where isRented is false
        System.out.println("Available Cars: ");
        int listNumber = 1;
        for (int i = 0; i < carStorage.length; i++){
            if (!carStorage[i].isRented()){
                System.out.println("("+ (i+1) + ") " + carStorage[i].getName());
                listNumber++;
            }

        }

        System.out.println("All Cars: ");
        for (int i = 0; i < carStorage.length; i++){
            String carStatus;
            if (!carStorage[i].isRented()){
                carStatus = "Available";
            } else {
                carStatus = "Unavailable";
            }
            System.out.println("("+ (i+1) + ") " + carStorage[i].getName() + " (" + carStatus + ")");

        }


    }


}
