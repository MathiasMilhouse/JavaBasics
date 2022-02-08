package com.careerdevs.recursion272022;

public class Recursion {

    public static void countDown (int num) {

        for(int i = num; i > 0; i--) {
            num = num - 1;
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        countDown(23);
    }

}
