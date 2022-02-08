package com.careerdevs.firetruckfactory;

public class Main {
    private String name;
    private int age;
    private int wheels;
    private Boolean red;

    public Main(String name, int age, int wheels, boolean red){
        this.name = name;
        this.age = age;
        this.wheels = wheels;
        this.red = false;
    }

    public String getName(){
        return name;
    }

    public String getAge(){
        return age + " " + "years old";
    }

    public String getWheels(){
        return wheels + " " + " wheels";
    }

    public Boolean getRed(){
        return red;
    }

    public static void main(String[] args) {
        Main myFiretruck = new Main("Wildland", 20, 8, true);
        System.out.println();
    }

}

