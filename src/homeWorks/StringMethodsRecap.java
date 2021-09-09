package homeWorks;

public class StringMethodsRecap {
    public static void main(String[]args){

        String str="Welcome to string handling tutorial";
        char ch1=str.charAt(0);
        System.out.println(ch1);// W , the first char of the string

        char ch2=str.charAt(5);
        System.out.println(ch2);//m , the sixth char of the string(because it starts from0)

        //============================================================================================
        //Method Chaining
        /*TASK: Ask user to enter a String value which shuold have space at the beginning or end
        - Replace all letter 'a's with single '*' and letter 'e's with double '**',
                - change all string value to UPPERCASE
                - Find index of First '*'
                - Multiply that value by 10 and
                - Print out the result


         */
        //use all methods in one line .  method chaining

        String text="   just do it "  ;
        int x= text.replace('a','*').trim().replace("e","**").toUpperCase().indexOf('*');
        // we stored  in int because the result is a number, it ended with index of. if it ended with a character we d store it
        //in char. if it ended in uppercase it will give us a string
        System.out.println(x);
        //==============================================================

// equalsignorecase= it returns true if characters of both strings are equal, ignoring case otherwise false.


        //"index of" is a method returns the position of the first occurrence of specified character(s) in a string.

        String str20="Hello planet earth, you are a great planet";
        System.out.println(str20.indexOf("e",5));

       // ================================================================
        //Substring method
        /* when you pass single index number into the substring method, it will take partial text starting from that index
        and it will include that indexs char
         */
        String str0="Techtorial";
        String part1= str0.substring(2);
        System.out.println(part1);// chtorial. starting point from 0

        //===================================================================
        //length
        String str9= new String("Welcome to tutorialspoint.com");
        String str8= new String("Tutorials");
        System.out.println(str9.length());//29
        //=======================

        String number= "1";
        number +="2";//number=number+"2";12
        number+=2;number=number+2;//122 //
        System.out.println(number);
              //  =================================
        









    }
}











