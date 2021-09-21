package homeWorks;

public class Task3Homework3 {
    public static void main(String[]args){
/*Given a string, if one or both of the first 2 chars is 'x', print the
string without those 'x' chars, and otherwise print the string
unchanged.
"xHi" → "Hi"
"Hxi" → "Hi"
"Tesxt" → "Testxt"
 */
        String word="xxxHi";
        if(word.charAt(0)=='x'){
            word=word.substring(3,word.length());
            System.out.println(word);// Hi






        }






    }
}
