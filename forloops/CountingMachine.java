package week1.forloops;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print( "Count to: " );
        int number=inp.nextInt();
        for ( int num=0; num<=number; num=num+1 ) {
            System.out.println(num);
        }


    }
}
