package week1.forloops;

import java.util.Scanner;

public class FizzBuzz {
//    public static boolean esMultiplo(int n1,int n2){
//        if (n1%n2==0)
//            return true;
//        else
//            return false;
//    }
//    public static void main(String[] args) {
//        //int num;
//        Scanner input = new Scanner(System.in);
//        //System.out.print( "Count to: " );
//        int number=input.nextInt();
//        for ( int num=1; num<=number; num=num+1 ) {
//            System.out.println(num);
//            //num==true;
//            if(int num % 3 == 0){
//                System.out.println("Fizz");
//            }else if(int num%5){
//                System.out.println("Buzz");
//            }else if(int num%3 && num%5){
//                System.out.println("FizzBuzz");
//            }else(num){
//            return num;
//        }
public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int number=inp.nextInt();
    for ( int num=1; num<=number; num=num+1 ) {
        System.out.println(num);
        if(num % 3==0){
            System.out.println("Fizz "+num);
    }else if(num % 5 ==0){
            System.out.println("Buzz "+num);
        }else if((num % 3 ==0) &&(num % 5 ==0)){
            System.out.println("FizzBuzz "+num);
        }



}
//        Scanner input = new Scanner(System.in);
//
//        int n; // Número
//        int x; // Múltiplo
//        int i; // Contador
//
//        System.out.print("¿De qué número quieres los múltiplos?: ");
//        x = input.nextInt();
//
//        System.out.print("¿Hasta qué número quieres la lista?: ");
//        n = input.nextInt();
//
//        for (i=1; i <=n; i++) {
//
//            if (i % x == 0)
//                System.out.println(i);

        }


//int multiplo = 240;
//System.out.print("Los multiplos de " + multiplo + " son");
//for (int x=1;x<multiplo;x++){
//	if (esMultiplo(multiplo,x)){
//		System.out.print(" " + x);

    }


