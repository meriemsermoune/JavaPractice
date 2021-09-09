package LOOPS;

import java.util.Scanner;

public class LoopPractice5 {
    public static void main(String[]args){
        /* ask user to give a number
        create a multiplication table from 1-10
         */
        Scanner input=new Scanner(System.in);

        System.out.println("please enter a number");
        int number= input.nextInt();

        int num2= 1;
        while(  num2<=10){
            System.out.println(number+" * "+ num2+ " = " +number*num2);
            num2++;



        }







    }
}
