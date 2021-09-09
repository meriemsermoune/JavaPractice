package SwitchStatement;

import java.util.Scanner;

public class task3 {
    public static void main(String[]args){

       /* Ask user to provide his favorite color
        if it is blue --> print --> "My favorite color is blue, too"
        if it is red --> print --> "I also like color red"
        if it is green --> print --> "Green is more natural"
        if it is pink --> print --> "Most women like pink"
        if it is none of those --> print --> "There is no matching color"
        Collapse


        */

        Scanner input= new Scanner(System.in);
        System.out.println("please enter your fav color");
        String color=input.nextLine();
        switch(color){
            case "blue":
                System.out.println("My fav color is blue too");
                break;
            case "red":
                System.out.println("i like red also");
                break;
            case "green":
                System.out.println("green is more natural");
                break;
            case "pink":
                System.out.println("most women like pink");
            default:
                System.out.println("there is no matching color");
                break;








        }







    }

}
