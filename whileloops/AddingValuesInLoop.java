package week1.whileloops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("I'll add up the numbers you give me");
        System.out.println("Number: ");
        int number = input.nextInt();
        System.out.println("The total so far is " + number);
        while (number!=0) {
            Scanner inp = new Scanner(System.in);
            System.out.println("Number:");
            int numberSum = inp.nextInt();
            int numberTotal = number+= numberSum;
           System.out.println("The total so far is " + numberTotal);
            if(numberSum==0){break;}
            //return number;
        }

    }
}
