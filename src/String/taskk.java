package String;

import java.util.Scanner;

public class taskk {
    public static void main(String[]args){
        /*TASK: get a string from User via scanner and:
-print:
	- first char
	- last char
	- index of second matching letter 'c'
	- lenght of string
	- index of x

         */
        Scanner bobby=new Scanner(System.in);
        System.out.println("enter a word");//

        String str= bobby.nextLine();
        System.out.println(str.charAt(0)); // fist char
        System.out.println(str.charAt(str.length()-1)); // matching lower case c
        System.out.println(str.length());// length
        System.out.println(str.indexOf('x'));// index of x
















    }
}
