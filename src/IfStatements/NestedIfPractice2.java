package IfStatements;

import java.util.Scanner;

public class NestedIfPractice2 {
    public static void main(String[]args){
       /* ask to candidate
        if s/he knows Java "Do you know Java?"
            yes>> ask if s/he know selenium "Do you know Selenium?"
                yes>> ask if s/he knows API testing "Do you know API Testing?"
                    yes >> ask if s/he knows SQl "Do you have SQL knowledge?"
                            yes >> "Congrats!! You are Hired!!!"
        if Java is no>> print "Please learn Java first and come back"
        if Selenium is No >> print "We need someone who has Selenium knowledge"
        if API Testing no >> print "We need someone who knows API testing"
        if SQL is No >> print "We need someone who has SQL knowledge"
         */


        Scanner input=new Scanner(System.in);
        System.out.println("welcome, do you know java?yes/no");
        String Java=input.next();

        if(Java.equalsIgnoreCase("yes")){
            System.out.println("do you know selenium?");
            String Selenium=input.next();
            if(Selenium.equalsIgnoreCase("yes")){



                System.out.println("do you know API");
                String API=input.next();

                if(API.equalsIgnoreCase("yes")){

                    System.out.println("do you know SQL");
                    String SQL=input.next();

                    if(SQL.equalsIgnoreCase("yes")){
                        System.out.println("congrats! you're hired");


                    }else {
                        System.out.println("we need someone who has SQL knowledge");
                    }


                } else {
                    System.out.println("we need someone who knows API");
                }


            } else {
                System.out.println("we need someone who knows Selenium");
            }


        }else{
            System.out.println("we need someone who knows Java");
        }









    }


}
