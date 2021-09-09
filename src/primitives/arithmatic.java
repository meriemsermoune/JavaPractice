package primitives;

public class arithmatic {
    public static void main(String[]args){

        // arithmetic operators are +-*% /


        int a=9;
        int b= a+5;
        int carCount= b*2; // if each person has 2 cars
        int finalCarCount= carCount-10;
        System.out.println(finalCarCount);
        int numberOfRowa= finalCarCount/3;
        System.out.println("i need this many rows to park the cars="+numberOfRowa);
        double division= a/2;
        System.out.println(division); //shows 4.0 as result/ because of the double
        int division1= a/2;// shows 4 as result/ because of int
        System.out.println(division1);
        double division3= a/2d;
        System.out.println(division3);// shows as 4.5
        //int division4= a/2d; // this will not compile , you can not store double result into int data type//








    }
}
