package Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);// take data into the class
        // assign something that we will take from scanner

        String firstName="Meriem";
        String lastName="Pink";
        System.out.println(lastName);

        lastName= input.nextLine(); //nextline() is for texts
        // it is going to take the input, the input will be in console

        System.out.println(lastName);// it will show pink then we can type whatever in the console.
        //we wrote white, when we enter it shows white back!
       String random= input.nextLine();// random is used as a storage// whatever users gave me i am putting it in random
        System.out.println(random);// it will show the last name. pink
        String middleName;
        middleName=input.nextLine();
        System.out.println(firstName+middleName+lastName);

































    }
}
