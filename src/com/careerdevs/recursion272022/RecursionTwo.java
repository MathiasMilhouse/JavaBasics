package com.careerdevs.recursion272022;

public class RecursionTwo {

    public static int sum(int n) {

        int t = 0;

        for(int i = n; i > 0; i--){
            t = t + n;
            n = n-1;
            System.out.println(t);
        }
        return t;
    }

    public static void main(String[] args) {
        sum(5);
    }

}
