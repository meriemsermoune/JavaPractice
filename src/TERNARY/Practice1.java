package TERNARY;

public class Practice1 {
    public static void main(String[]args){
        int num1=5;
        int num2=5;
        int num3=6;

       int result1= num1==num2 ? 25 : 30;// the result is either 25 or 30
        System.out.println(result1);// it will show 25
         String result2=num1==num3 ? "Hello" : "bye";
         System.out.println(result2);// bye because the condition num1==num2 is not equal

       System.out.println(num1==num2 ? "gooMorning": 5);
       int result3=num1==num3 ? num1++ + num2++ :num3++ + num3;// first condition is false so the second one if correct
       System.out.println(result3);











    }


}
