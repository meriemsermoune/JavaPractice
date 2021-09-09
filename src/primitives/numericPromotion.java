package primitives;

public class numericPromotion {
    public static void main(String[]args){
        byte b1=112;
        short sh1=30;
       // byte sum1=b1+sh1;// it will not compile because of the numeric promotion
        int sum1=b1+sh1;// java promotes smaller data types which are "bytes and short" to int data types
        float fl1= 2.3f;
        double dbl=3.4;
       // float sum2= fl1+dbl; // will not compile/ compile time error
        System.out.println(fl1+dbl);// it will work because it is not storing it is just println
        double sum2= fl1+dbl;
        System.out.println(sum2);
        //sum1 * sum2;// if one of the numbers is double , results is given as double... results is in decimal number thats why you cant stpre
        //in  int data
        //product1= sum1+sum2;
        double product= sum1*sum2; // it compiles because we used double


        int i1=23;
        double db2= i1;// double is capable of int.. it  will work
        //int i2=db2; // do not compile
        //long l1=db2;// do not compile;




    }
}
