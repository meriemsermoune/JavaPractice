package primitives;

public class comparisonOperator1 {
    public static void main(String[]args){
        //==, !=, <,> <=, >=--> any comparison operator will return true or false
        int x =10;
        int y=10;
        int z=65;

       //boolean result1= x == y= true value- boolean type--
        boolean result1= x==y;
        System.out.println(result1);


        char ch1='A';
        char ch2= 65;
        char ch3= 66;

        boolean result2= ch1==ch2;
        System.out.println(result2);// true//
        boolean result3= z==ch2;
        System.out.println(result3);// true//
       boolean ch4= z== ch3;
       System.out.println(ch4);// false
        boolean result5= x>y;
        System.out.println(result5);
        boolean r6= x <=y;
        System.out.println(r6);

        boolean r7= result1==result2;
        System.out.println(r7);// true
        boolean r8= result1!=result2;
        System.out.println(r8);// false











    }
}
