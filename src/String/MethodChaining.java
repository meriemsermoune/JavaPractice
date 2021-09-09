package String;

public class MethodChaining {
    public static void main(String[]args){
        /*TASK: Ask user to enter a String value which shuold have space at the beginning or end
        - Replace all letter 'a's with single '*' and letter 'e's with double '**',
                - change all string value to UPPERCASE
                - Find index of First '*'
                - Multiply that value by 10 and
                - Print out the result


         */
        //use all methods in one line . thi sis method chaining

        String text="   just do it "  ;
       int x= text.replace('a','*').trim().replace("e","**").toUpperCase().indexOf('*');
       // we stored  in int because the result is a number, it ended with index of. if it ended with a character we d store it
        //in char. if it ended in uppercase it will give us a string
       System.out.println(x);












    }
}
