package homeWorks;

import java.util.Scanner;

public class task3Homework4 {
    public static void main(String[]args){


  /*Using scanner ask user to provide the string value.
        Print "dad" if the given string contains the "dad",
        but where the middle 'a' char can be any char.
        Example:
        Input the year: testdadtest Output :dad
        Input the year: testd7dtest Output :dad
        Input the year: testdodtest Output :dad
        Input the year: testDudtest Output :dad */

        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a String value");
        String str = scan.nextLine();
        int i = 0;
        while(i<str.length()-2) {
            if (str.charAt(i) == 'd' || str.charAt(i) == 'D') {
                //  System.out.println(str.charAt(i));
                //   System.out.println(str.charAt(i+2));
                if (str.charAt(i + 2) == 'd' || str.charAt(i + 2) == 'D') {
                    // System.out.println(str.charAt(i+2));

                    System.out.println("dad");
                }

            }
            i++;
        }



    }
}
