package Scanner;


import java.util.Scanner;

public class scannerPractice3 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("please enter your full name");
        //user will give value
       String fullName= scanner.nextLine();// next() only read one word before the space// nextLine reads all
       System.out.println("you entered this value"+" "+ fullName);

       System.out.println("what is your state");// we'll type illinois, when we run again with charAt it will show
        //the first letter I

       char firstLetter=scanner.next().charAt(0); // 0 is the first letter in Illinois.for indexing we start from 0
        System.out.println(firstLetter);























    }
}
