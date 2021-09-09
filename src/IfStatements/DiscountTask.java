package IfStatements;

public class DiscountTask {
    public static void main(String[]args){
        /*if your payment is 100 or more you will get 20% discount
        otherwise you will get 5%
        print out discount total
         */
        //there is 1 condition, what is ur chance to get 20%discount
        double payment= 200;// 200 is jst  a number // if the number is 80 we will only get 5% discount cuz <100
        if (payment>=100){
            payment-=payment*0.2;
            System.out.println("your payment after 20% discount is="+payment);
        }
        else{

            payment-=payment*0.05;
            System.out.println("your payment after 5%"+payment);// the second condition will not show in console



        }










    }
}
