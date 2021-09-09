package IfStatements;

import java.util.Scanner;

public class elseIfPractice {
    public static void main(String[]args){
        //if the number from 1 to 20; 0-5( number is between 0-5)
        //5-10==> 6-10
        //11-15/
        // 16==>20
        Scanner scanner=new Scanner(System.in);
        System.out.println("please pick a number between 0 to 20 ");
        int number= scanner.nextInt();
        if (number>=0 && number>=5){
            System.out.println("your number is between 0-5");

        } else if(number>5 &&number <=10){
            System.out.println("your number is between 6-10");

        }else if (number>=11 && number<=15){
            System.out.println("your number is between 11-15");

        }





    }
}
