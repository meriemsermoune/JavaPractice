package primitives;

public class logicalOperator2 {
    public static void main(String[]args){
// kids event, they must be older than 5 >5 , younger than 12 <12
        // the other requirement is , their height needs to be < 46" inches to be able to attend//
        int kidsAge= 2;
        int height=36;
        int minimAge=5;
        int maxAge=12;
        int height2= 46;
       boolean kidGo= (kidsAge>=minimAge && kidsAge<=maxAge) && height>=height2;
       System.out.println(kidGo);
       //















    }
}
