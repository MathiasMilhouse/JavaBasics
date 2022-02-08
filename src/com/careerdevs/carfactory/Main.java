package com.careerdevs.carfactory;
import java.util.Scanner;

public class Main{

    public static void createAcar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter car make:");
        String make = scanner.nextLine();

        System.out.println("Enter car model:");
        String model = scanner.nextLine();

        System.out.println("Enter car owner's name:");
        String owner = scanner.nextLine();

        System.out.println(owner + " owns the car " + make + " " + model );
    }

    public static void createAcarObject() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter car make:");
        String make = scanner.nextLine();

        System.out.println();
    }

    public static void main(String[] args) {
        createAcar();
    }
}
