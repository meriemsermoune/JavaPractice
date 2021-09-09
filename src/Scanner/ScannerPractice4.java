package Scanner;

import java.util.Scanner;

public class ScannerPractice4 {
    public static void main(String[]args){
        /*David wants to deposit his money into his bank account
-he already got $200 in his account
-he got three different paychecks ($480, $600 and $350)
-he can only deposit one paycheck at a time
-after he got his money in the account
- he bought a phone for $599 and headphone for $299
- calculate his final money in his account
open a new class under scanner package and name it as "MoneyTransaction"

         */
        Scanner scanner=new Scanner(System.in);
        double balance=200;
        System.out.println("How much do you want to deposit");
       double firstCheck= scanner.nextDouble();
       balance+=firstCheck;
       System.out.println("what is your current balance is"+balance);
       System.out.println("how much do you want to deposit");
       double secondCheck=scanner.nextDouble();
       System.out.println("your current balance is"+balance);
        System.out.println("how much do you want to deposit");
        double thirdCheck=scanner.nextDouble();
        balance+=thirdCheck;
        System.out.println("your current balance is"+balance);

        System.out.println("what is your phone price");
        double phonePrice=scanner.nextDouble();
        balance-=phonePrice;
        System.out.println("your current balance is"+balance);

        System.out.println("what is the headphone price");
        double headphone=scanner.nextDouble();
        balance-=headphone;
        System.out.println("your current balance is"+balance);
















}











}
