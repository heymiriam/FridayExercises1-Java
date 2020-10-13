package week1.keyboardinput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! What's your name?");
        String name = input.nextLine();
        System.out.println("Hi, " + name + ". How old are you?");
        String age = input.nextLine();
        int ageNumber = Integer.parseInt(age);
        int plusFive = ageNumber + 5;
        int minusFive = ageNumber - 5;


        System.out.println("Did you know that in 5 years you will be " + plusFive + " years old?");
        System.out.println("And five years ago you were " + minusFive + "! Imagine that!");
    }
}