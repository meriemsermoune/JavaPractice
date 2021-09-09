package primitives;

public class compoundAssignment {
    public static void main(String[]args){



        int carNumber= 7;
        carNumber=carNumber+5;
        System.out.println(carNumber);//12 cars
        carNumber+=5;
        System.out.println(carNumber);//17
        carNumber/=2;// carNumber= carNumber/2

        System.out.println(carNumber);//8 because of int
        int count;
        count=carNumber*2;
        System.out.println(count);//16
        count-=carNumber;// count= count-carNumber
        System.out.println(count);//8
        int payment= 50;
        payment *= carNumber;
        System.out.println(payment);//400
        int modulus= 1000;
        modulus%= payment;// first java divides 1000/400 and find the remainder then it assigns the value for modulus
        //variable

        System.out.println(modulus);//









    }



}
