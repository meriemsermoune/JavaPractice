package variables;

public class practice {
    public static void main(String[]args){
        int apples= 10;
        int oranges= 20;
        int kiwis= 30;
        System.out.println(oranges);
        System.out.println(kiwis);
        System.out.println("total number of fruits is=" + apples + oranges + kiwis);// result is 102030
        System.out.println("total number of fruits is ="+(apples+ oranges+kiwis));// result is 60, correct addition
        System.out.println(apples+oranges+kiwis);// correct addition as well
        System.out.println(" total number of apples and kiwis is=" +(apples+oranges)+"difference between kiwis and apples is= " +
                (kiwis-apples));
        // int apples=10 is called declaring the variable, giving the data type
        // apple=25 is initializing the variable, which is assigning the value for it
        // int apple= 25 is declaring and initializing at the same time
        int apple= 25;
        int banana= 2;
        System.out.println("number of apples is="+ apple);
        int applePrice= 3;
        int bananaPrice= 2;
        int totalApplePrice= applePrice+apple;
        int totalBananaPrice = bananaPrice+banana;

        System.out.println(totalBananaPrice+totalApplePrice);












    }
}
