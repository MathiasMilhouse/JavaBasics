package com.careerdevs.algorithmcli;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UI {
    private static Scanner scanner = new Scanner(System.in);

    public static String readString(String question){

        System.out.println(question + "\nInput: ");
        return scanner.nextLine();
    }

    public static int readInt (String question, int min, int max){

        while (true) {
            try {
                System.out.println(question);
                System.out.println("Number (" + min + " - " + max + "): ");

                int userInt = scanner.nextInt();

                scanner.nextLine();

                if (userInt >= min && userInt <= max) {
                    return userInt;
                }

                System.out.println("Number must be in the range (" + min + " - " + max + ")");


            } catch (InputMismatchException e) {
                System.out.println("You must enter a whole number, try again...");
                scanner.nextLine();

            } catch (Exception e) {
                System.out.println("An error unknown occurred");
                System.out.println(e + "\n" + e.getMessage());
                return 0;
            }

        }
    }

    public static String lineSpacer () {
        return "-".repeat(15);
    }
}

