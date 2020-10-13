package week1.keyboardinput;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Hey! What's your name?");
        String yourName= inp.nextLine();

            System.out.println("Hi " + yourName + "! How old are you?");
            String yourAge=inp.next();
            System.out.println("So you are " + yourAge + ",eh? That's not that old.");
            System.out.print("How much do you make, " + yourName + "?");
            String yourSalary=inp.next();
            System.out.println(yourSalary + "! I hope that's per hour and not per year! LOL!");

    }


}
