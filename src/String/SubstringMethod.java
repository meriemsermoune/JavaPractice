package String;

public class SubstringMethod {
    public static void main(String[]args){
        /* when you pass single index number into the substring method, it will take partial text starting from that index
        and it will include that indexs char
         */
        String str="Techtorial";
        String part1= str.substring(2);
        System.out.println(part1);// chtorial. starting point from 0

        String part2= str.substring(2,4);// beggining and ending, it will start from begining index which is included
        //and and stop at ending index which is not included!
        System.out.println(part2);// ch
        System.out.println(str.substring(0));// starting from 0 and 0 is included so the output is Techtorial
        // print last three chars from string I will do it
        String A= "I will do it soon";
        System.out.println(A.substring(A.length()-3));// iw will print as oon
        //when your string value dos have enough value to take substring it will throw an exception(StringOutOfBound)

        














    }
}
