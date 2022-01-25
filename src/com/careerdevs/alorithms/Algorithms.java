package com.careerdevs.alorithms;

import java.util.Scanner;

public class Algorithms{
// Algorithm 1
    static int ReturnFirstNumber(Integer[] args){
        return args[0];
    }

// Algorithm 2
    static int ReturnNextNumber(int num){
        return num + 1;
    }

// Algorithm 3
    static int FindIndex(int[] arr, int number){
        return arr.indexOf(number);
    }

// Algorithm 4
    static int Convert(int num){
        return num * 60;
    }

// Algorithm 5
    static String ReturnSomething(String sentence){
        return "something" + " " + sentence;
    }

// Algorithm 6
    static Boolean Reverse(Boolean bool){
        if (bool == true) {
            return false;
        } else {
            return true;
        }
    }

// Algorithm 7
    static Integer GetWordCount(String sentence){
        String[] words = sentence.split(" ");
        return words.length;
    }

// Algorithm 8
    static Boolean HigherNumber(Integer[] arr, Integer n){
        if (arr.length == 0) return false;
        for (int i : arr) {
            if (i >= n) return true;
        }
        return false;
    }

// Algorithm 9
    static Integer SyllableCount(String word){
        return word.replaceAll("[^aeiouAEIOU]", "").length();
    }

// Algorithm 10
    static Integer AddNumbers(Integer a, Integer b) {
        return a + b;
    }

//Algorithm 11
     static Boolean NumbersEqual(Integer a, Integer b) {
        if (a == b) {
         return true;
    } else {
         return false;
        }
    }

//Algorithm 12
    static Integer ConvertAgeDays(Integer n){
        return n * 365;
    }

//Algorithm 13
    static String NameGreeting(String name){
        return "Hello" + " " + name;
    }

//Algorithm 14
    static String ReverseString(String name){
        String reverse = "";
        for(int i= name.length()-1;i>= 0; i--)
        {
            reverse = reverse + name.charAt(i);
        }
        return reverse;
    }

//BONUS SECTION #1

// BONUS SECTION #1 END

//Algorithm 15
    static Boolean EqualsTen(int a, int b){
        return (a == 10 || b == 10 || (a + b) == 10);
    }

//Algorithm 16
    static int SyllableCount2(String word){
        String[] syl = word.split("-");
        return syl.length;
    }

//Algorithm 17
    static Boolean CaseComparison(String a, String b){
        return a.equalsIgnoreCase(b);
    }

//Algorithm 18
    static String hackerSpeak(String str){
        return str.replace('a', '4').replace('e', '3').replace('i', '1').replace('o', '0').replace('s', '5');
    }

    public static void main(String[] args) {

    }

}
