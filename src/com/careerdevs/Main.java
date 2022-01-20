package com.careerdevs;
import java.util.Scanner;

public class Main {

    public static String createFullName(String str1, String str2){
        System.out.println(str1 + " " + str2);
        return(str1 + " " + str2);
    }

    public static void whatIsYourFullName(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name:");
        String fName = scanner.nextLine();

        System.out.println("Enter last name:");
        String lName = scanner.nextLine();

        System.out.println("It is so nice to formally meet you " + fName + " " + lName);
    }

    public static void main(String[] args) {
	String firstName = "Mathias";
    String lastName = "Milhouse";
    String fullName = firstName + " " + lastName;
    System.out.println(fullName);
    System.out.println(createFullName("Mathias", "Milhouse"));
    }
}
