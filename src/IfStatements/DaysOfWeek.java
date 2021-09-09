package IfStatements;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[]args){
        /* ask user  to provide a number from 1 to 7; if users enter 1 print it is monday
        if users enter 2 print it is tuesday
        so on....
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter a number between1-7 ");
        int number=scanner.nextInt();

        if (number==1){
            System.out.println("it is Monday");

        }
        if(number==2){
            System.out.println("it is Tuesday");
        }
        if(number==3){
            System.out.println("it is wednesday ");

        }
        if (number==4){
            System.out.println("it is Thursday");
        }
        if (number==5){
            System.out.println("it is Friday");
        }
        if(number==6){
            System.out.println("it is saturday");

        }
        if(number==7) {
            System.out.println("it is Sunday");
        }









    }
}

