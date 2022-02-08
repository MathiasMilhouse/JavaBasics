package com.careerdevs.carrentalapp;

import javax.management.remote.JMXAddressable;

public class Car {
    private String make;
    private String model;
    private boolean isRented;

    public Car(String make, String model, boolean isRented){
        this.make = make;
        this.model = model;
        this.isRented = false;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public String getName(){
        return make + " " + model;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented){
        isRented = rented;
    }

}
