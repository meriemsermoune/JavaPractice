package homeWorks;

public class Project2HomeWork {
    public static void main(String[]args){

        // Write a program that will accept 5 digit number & will print reversed number at the end!


        int Number= 97534;
        int firstDigitNumber=Number%10;
        System.out.println("first digit number="+ firstDigitNumber);// 4 is the first digit number.

        //to find the second digit number we have to divide by /10 first, then %10!
        Number=Number/10;
        int secondDigit= Number%10;
        System.out.println("the second digit is="+ secondDigit);// 3 is the second digit number.
        Number=Number/10; 
        int thirdDigitNumber= Number%10;
        System.out.println("the third digit number is="+ thirdDigitNumber);// 5 is the third digit number.
        Number=Number/10;
        int fourthDigitNumber=Number%10;
        System.out.println("the fourth digit number is="+ fourthDigitNumber);// 7 is the fourth digit number.
        Number=Number/10;
        int fifthDigitNumber=Number%10;
        System.out.println("The fifth digit number is="+ fifthDigitNumber);//9 is the fifth digit number.

        System.out.println("The five digit numbers are="+firstDigitNumber+ secondDigit+thirdDigitNumber +fourthDigitNumber+fifthDigitNumber);

        










        





    }

}
