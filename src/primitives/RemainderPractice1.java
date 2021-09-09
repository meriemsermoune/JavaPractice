package primitives;

public class RemainderPractice1 {
    public static void main(String[]args){
        // 1 2 3 find the sum of digits from the give number
        // 1+2=3=6--> ("the sum of digit=sum of digit// update my number from 123 to 12
       int number= 123;
       int firstDigit=number % 10;// 123/10 --- 12 remainder is 3
        System.out.println(firstDigit);
        number=number/10;
        int secondDigit= number% 10;// 12/10 --- 1 remainder is 2
        System.out.println(secondDigit);
        number= number/10;
        int thirdDigit= number%10;
        System.out.println(thirdDigit);

        System.out.println("the sum of digits is="+ (firstDigit+secondDigit+thirdDigit));






    }


}
