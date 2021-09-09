package String;

public class methods4 {
    public static void main(String[]args){

        String a="john";
        String b="john";
        boolean b1= a.equals(b); //true
        System.out.println(b1);

        boolean b2= a.equals("john");// true
        System.out.println(b2);

        String c="JOHN";
        boolean b3= a.equals(c);
        System.out.println(b3);//false
        //===========
        //equalsignoreCase... john same as JHON except the cases
       boolean b4= a.equalsIgnoreCase(c);// ture
        System.out.println(b4);
        System.out.println("Java is".equalsIgnoreCase("JAVA is"));//true
       // ==========================
        //replace() method== replace original value with new one
        String str1="Java is cool";
        str1= str1.replace('o','$');
        System.out.println(str1);

        str1=str1.replace("c$$l","easy");
        System.out.println(str1);
        String text1= "tava";
        str1=str1.replace("Java",text1);
        System.out.println(str1);


        //trim() method, removes spaces before and after your string, only before and after not in the middle
        String text2="    it is saturday  ";

        System.out.println(text2);

        text2=text2.trim();
        System.out.println(text2);

        //"Do whatever it takes"
        //concat with "to learn Java"
        // make everything to uppercase
        //replace "Java" with "Job"
        //check if the text contains " chicago'
        String string="Do whatever it takes";
        string= string.concat("to learn Java");
        string=string.toUpperCase();
        string= string.replace("JAVA","Job");
        System.out.println("does it contain chicago="+(string.contains("Chicago")));















    }
}
