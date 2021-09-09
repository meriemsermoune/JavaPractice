package primitives;

public class comparativeOperators {
    public static void main(String[]args){
        int a=3;
        int b=4;
        int c=4;
        System.out.println(a==b);// false
        System.out.println(b==c);// true
        System.out.println(!(a==b));// true // exlamation mark(! (a==b))
        System.out.println(!(b==c));//false
        //=====================
        System.out.println(a != b);// true
        System.out.println(b != c);// false
        //=========================
        System.out.println(a>b);// false
        System.out.println(b>c);// false

        System.out.println(a<b);// true
        System.out.println(a<c);// true
        System.out.println(b<c);// false
        //=====================================
        //  in ta=3;
        // int b=4;
        //int c=4;
        System.out.println(a >= b);// false
        System.out.println(c >=b);// true
        //=================
        System.out.println(c <=b);// true
        System.out.println(a <= c); // true






















    }
}
