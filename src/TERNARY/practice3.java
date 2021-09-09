package TERNARY;

import java.util.Locale;
import java.util.Scanner;

public class practice3 {
    public static void main(String[]args){
        /* ask user for their last name
        if the last name starts from A to K
        concat last name with "most popular last name

        otherwise, concat the last name with "well known laast name"

         */
        Scanner input= new Scanner(System.in);
        System.out.println("please enter your last name!");
        String LastName= input.nextLine().toUpperCase();
       String print= LastName.charAt(0) >='A' && LastName.charAt(0) <='K' ? LastName+ "most popular last name": LastName+"well known last name";
       System.out.println(print);




    }
}
