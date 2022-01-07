package com.careerdevs;

public class Main {

    public static String createFullName(String str1, String str2){
        System.out.println(str1 + " " + str2);
        return(str1 + " " + str2);
    }

    public static void main(String[] args) {
	String firstName = "Mathias";
    String lastName = "Milhouse";
    String fullName = firstName + " " + lastName;
    System.out.println(fullName);
    System.out.println(createFullName("Mathias", "Milhouse"));
    }

}
