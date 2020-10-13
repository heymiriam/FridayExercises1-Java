package week1.ifstatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        //age	message
        //less than 16	"You can't drive."
        //16 to 17	"You can drive but not vote."
        //18 to 24	"You can vote but not rent a car."
        //25 or older	"You can do pretty much anything."
        //Note that unlike the original "How Old Are You" assignment, this program must only display exactly one message for a given age and not multiple messages.
        //
        //Hey, what's your name? (Sorry, I keep forgetting.) Billy_Corgan
        //Ok, Billy_Corgan, how old are you? 17
        //
        //You can drive but you can't vote, Billy_Corgan.
        Scanner input= new Scanner(System.in);
        System.out.println("Hey, what's your name? (Sorry, I keep forgetting).");
        String name=input.nextLine();
        System.out.println("Ok, " + name + ", how old are you?");
        String age=input.nextLine();
        int ageNumber=Integer.parseInt(age);
        if(ageNumber>=18 && ageNumber<=24){
            System.out.println("You can vote but not rent a car.");
        }else if(ageNumber>=16 && ageNumber<=17){
            System.out.println("You can drive but not vote.");
        }else if(ageNumber>=25 && ageNumber<=110){
            System.out.println("You can do pretty much anything.");
        }else if(ageNumber<16){
            System.out.println("You can't drive.");
        }else{
            System.out.println("Omg! You must be a vampire.");
        }
    }
}
