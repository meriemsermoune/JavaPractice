package primitives;

public class remainderPractice2 {
    public static void main(String[]args){
        // find the product of digit from the given four digit number 1234
        //print the result as following
        // the product is...
        int number= 1234;
        int firstDigitNum= number%10;
        System.out.println(firstDigitNum);
        int secNum= number/10;
        System.out.println(secNum);
        int thirdNum= secNum/10;
        System.out.println(thirdNum);
        int fourthNum= thirdNum/10;
        System.out.println(fourthNum);
        System.out.println( "the product is=" + ( firstDigitNum+secNum+thirdNum+fourthNum));




        int numb= 1432;
        int digitOne= numb % 10;// first digit which is 2
        numb=numb/10;// this is my new number which is 143
       int digitTwo= numb % 10; // this is the second digit 3
        numb= numb/10; // this is my new number 14
      int  digitThree= numb%10;
      numb=numb%10;// this is the new number
        int digitFour= numb%10; // last digit 1
        int whole= digitOne*digitTwo*digitThree*digitFour;
        System.out.println(whole);














































    }
}
