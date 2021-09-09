package primitives;

public class DataTypes {

    public static void main(String[]args){

    /*
    there are 8 different primitive data types
    byte, short, int, long, float, double --> for numbers
    char --> for single character
    boolean --> for True/False
     */
        byte number = 6;
        byte number1 = 127;
        // byte number2 = 129; for byte the range is -128 to 127 that is why it will not compile

        short number3 = 100;
        short number4 = 31789;
        int number5 = 32_000;  // you can use underscore (_) in between digits.
        int number6 = 1_000_000;  // you ca use underscore (_) in between digits. it will not effect the value. it makes just more visible.

        System.out.println(number6);
        long number7 = 341345;
        long number8 = 74_813_492_034_854L; // you should use 'l/L' at the end of the long values.

        System.out.println(number8);

        float number9 = 2.3f;  // you should use f/F at the end of the float values.

        float number10 = 56;  //56 -->56.0
        double number13 = 89; //89 --> 89.0

        System.out.println("Value of number10 --> " + number10);
        System.out.println("value of number13 --> " + number13);


        // int a = 5.6; you cannot store decimal value in int data type.

        float number11 = 56.0f;

        double number12 = 2.1;
        // most common type usage are int, double, long, boolean








    }
}
