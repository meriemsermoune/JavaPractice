package LOOPS;

public class LoopsTask1 {
    public static void main(String[] args) {
        /*print out "I am here today"
        for the ages between 23 to 26
        after 26, print I am not here
         */
        int age = 23;
        System.out.println("I am not here today");


        while (age >= 23 && age <= 26) {

            System.out.println("I am here today");

            age++;

        }
        System.out.println("I am not here today");

        /* print out numbers between 10 to 20


         */
        int number=10;

        while(number<21){
            System.out.println("the number is now"+number);
            number++;


        }























    }
}
