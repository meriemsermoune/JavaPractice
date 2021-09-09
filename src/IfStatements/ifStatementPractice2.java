package IfStatements;

public class ifStatementPractice2 {
    public static void main(String[]args) {
        //age>18 || 100$
        int age = 12;
        double money = 200;
        if (age >= 18) {
            System.out.println("can i go");// this will be ignored
        }


        if (money >= 100) {
            System.out.println("you can go to picnic with this money" + money);//this will show

        }
        if (age > 10 || money >= 100) ;{
            System.out.println("you are okay with one of the requirements");// this will show and run
        }







    }

}
