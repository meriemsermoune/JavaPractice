package LOOPS;

import java.util.Scanner;

public class LoopsPractice {
    public static void main(String[]args){
        /* user haas 100$
        as long as user has balance more than 0$
        ask user how much money he/she wants to spend
        if the amount is less than balance update the balance and show it to user
        if the amount is more than the balance
        print(you don't have enough money in the account! your balance is...
         */
        Scanner input=new Scanner(System.in);
        double balance=100;

        while (balance>0){

            System.out.println("how much money you wanna spend?");
            double spending=input.nextDouble();

            if(spending<=balance){
                balance-=spending;
                System.out.println("your new balance is"+balance);


            }else{
                System.out.println("you don't have enough money in the account, your balance is");
            }
        }







            }
}
