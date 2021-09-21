package Homework3;

public class Task4 {
    public static void main(String[] args) {
        /* Given a string, if a length 2 substring appears at both its beginning and end,
         print a string without the substring at the beginning, so "HelloHe" yields "lloHe".
         The substring may overlap with itself, so "Hi" yields "".
         Otherwise, print the original string unchanged.
         Example:
         "TestTe" --> print stTe "TestTi" --> print TestTi*/

        String str= "TestTe";
        if((str.charAt(0)==str.charAt(str.length()-2))&&(str.charAt(1)==str.charAt(str.length()-1))){
            str=str.substring(2,str.length());
            System.out.println(str);

        } else {
            System.out.println(str);
        }

}
}