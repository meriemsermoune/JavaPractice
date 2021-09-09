package primitives;

public class castingPractice {
    public static void main(String[]args){

        long l1=120;
       // int i1=l1;//cant compile larger data type can not be stored in smaller data type
        int i2=(int)l1; // casting add (int) before l1/ explicit casting (auto narrowing)
        double db1=l1; // double is capable it can hold a whole number// imp;icit casting auto widening
        short apple= 126;
        short samsung=4;
        byte total=(byte) (apple+samsung);//=126

        System.out.println(total);
        byte total1= (byte) (apple+samsung);

        double d1= 2.3;
        int i= 12;
        i+=d1; // i=id1 12+2.3=14.4// when you do compound assignment you need to do explicit casting
        System.out.println(+i);

        int i3=(int)d1;// it will show 2 even when casting but the result is 2 because we used int//
        System.out.println(i3);


















    }
}
