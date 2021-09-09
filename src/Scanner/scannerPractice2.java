package Scanner;

import java.util.Scanner;

public class scannerPractice2 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        //String name= "David";// we want to take david from user by using scanner
        // we dont wanna declare the value directly here so in the next step we will use input


        String name=input.nextLine();
        System.out.println("please enter your name");

        System.out.println("your name is="+ name);




        System.out.println("please enter your last name");

        String lastName =input.nextLine();
        System.out.println("Your full name is=" + name +" "+ lastName);

        System.out.println("please enter your age");
        int age= input.nextInt();

        System.out.println("your age will be ="+(age+10)+ "in 10 years");

        System.out.println("please enter your city name");
        name=input.nextLine();
        System.out.println(name);






    }
}
