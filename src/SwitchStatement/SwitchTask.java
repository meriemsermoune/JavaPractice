package SwitchStatement;

import java.util.Scanner;

public class SwitchTask {
    public static void main(String[]args){


        /*solve the questions by using switch
        ask user to provide a number between 1-7
        print the matching name of the day for that number
        when users enter 1==> "it iS Monday"

         */
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a number from 1 to 7");
        int number=input.nextInt();

        switch (number){
            case 1:
                System.out.println("today is Monday");
                break;
            case 2:
                System.out.println("today is Tuesday");
                break;
            case 3:
                System.out.println("today is Wednesday");
                break;
            case 4:
                System.out.println("today is Thursday");
                break;
            case 5:
                System.out.println("today is Friday");
                break;
            case 6:
                System.out.println("today is Saturday");
                break;
            case 7:
                System.out.println("today is Sunday");
                break;



        }


























    }
}
