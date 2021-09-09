package String;

import java.util.Scanner;

public class Task1 {
    public static void main(String[]args){

        /*ASK: Ask user to enter a String value which shuold have space at the beginning or end
        - Replace all letter 'a's with single '*' and letter 'e's with double '**',
                - change all string value to UPPERCASE
                - Find index of First '*'
                - Multiply that value by 10 and
                - Print out the result
                Collapse

         */
Scanner scanner=new Scanner(System.in);
System.out.println( "please enter a string value may have space in the beginning or the end");
String text=scanner.nextLine();
System.out.println(text);
text=text.trim();
System.out.println(text);


text=text.replace('a','*');
System.out.println(text);

text=text.replace("o","**");
System.out.println(text);

text=text.toUpperCase();
System.out.println(text);

int indexOfStar=text.indexOf('*');
System.out.println(indexOfStar);
System.out.println(indexOfStar*10);

//find and print out middle chars index number
        //chicago, the middle chart is "c". // find length then divide it by 2
        text.charAt(4);

        text.indexOf("a");
        int index=text.indexOf(text.charAt((text.length()-1)/2));
        System.out.println(index);




































    }


}
