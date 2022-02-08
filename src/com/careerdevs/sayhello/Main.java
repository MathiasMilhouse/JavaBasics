package com.careerdevs.sayhello;

import java.util.Scanner;

public class Main {

    public static void whatIsYourName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String name = scanner.nextLine();

        System.out.println("It's so nice to  meet you" + " " + name);
    }

    public static void whatIsYourFullName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name:");
        String fName = scanner.nextLine();

        System.out.println("Enter last name:");
        String lName = scanner.nextLine();

        System.out.println("It is so nice to formally meet you " + fName + " " + lName);
    }

    public static void main(String[] args) {
        whatIsYourName();
        whatIsYourFullName();
    }
}
