package homeWorks;

public class Task4Homework3 {
    public static void main(String[]args){
        /*
Given a string, if a length 2 substring appears at both its
beginning and end, print a string without the substring at the
beginning, so "HelloHe" yields "lloHe". The substring may overlap
with itself, so "Hi" yields "". Otherwise, print the original string
unchanged.
Example:
"TestTe" --> print stTe
"TestTi" --> print TestTi

         */
        String word="TestTe";
        if((word.charAt(0)==word.charAt(word.length()-2))&&(word.charAt(1)==word.charAt(word.length()-1))){
            word=word.substring(2,word.length());
            System.out.println(word);

        } else {
            System.out.println(word);
        }










    }
}
