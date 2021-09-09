package IfStatements;

import java.util.Scanner;

public class nestedIf {
    public static void main(String[]args){
        // ask user for hia/her city name. if the city name is chicago ask user
        //what is their school name, if the school name is Techtorial print
        // you are lucky to be in batch10
        //if the school name is not techtorial print--> come to chicago
        //if the city name is not chicago, print==> please come to chicago
        //
        Scanner scanner=new Scanner(System.in);
        System.out.println("what is your city name?");
        String CityName= scanner.nextLine();
        if (CityName.equalsIgnoreCase("Chicago")) {
            System.out.println("what is your school name?");
            String schoolName = scanner.nextLine();
            if (schoolName.equalsIgnoreCase("techtorial")) {
                System.out.println("you are the best");
            } else {
                System.out.println("please visit us at techtorial");
            }
        }else{
            System.out.println("please come to chicago");





            }
        }














    }

