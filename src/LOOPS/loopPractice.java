package LOOPS;

import java.util.Scanner;

public class loopPractice {
    public static void main(String[]args){
        /* ask user to enter an int number
        find and print the numbers which can divide that given number
         */
        Scanner input= new Scanner(System.in);
        System.out.println("please enter an int value");
        int number= input.nextInt();
        int divider=1;
        while(divider<=number){
            if(number % divider==0){
                System.out.println(divider);

        }
            divider++;




       }













    }
}
