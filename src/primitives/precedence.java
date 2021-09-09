package primitives;

public class precedence {
    public static void main(String[]args){
        int count= 10+15;
        int count1= count+3*5;
        System.out.println(count); //25
        System.out.println(count1);//25+15=40
        int count2= count-count1 / 2*3;


        //40/2=20*-3 // 25-60=-35

        System.out.println(count2);

        int count3=6/3 *5 %3; // division first 6/3=2 2*5=10 10%3= 1
        int count4= 6-4-count+count3;
        System.out.println(count3);//1
        System.out.println(count4); //-22
        System.out.println("total of count3 and count4="+ count3+count4); // -21 it shows 1-22 because of parethesis
        System.out.println("total count3 and count4="+ (count3+count4));// this is correct


        // 50$ food 250$ electronics 80$ shoes
        //tax calculation for food 10%
        //tax for electronics is 20%
        // tax for shoes is 15%
        // 50*0.10 250*0.2 80*0.15
        double payment= 50+250+80 +(50*0.10)+(250*0.20)+(80*0.15);

        System.out.println(payment);

        double number= (20*(0.1+500)*2+30)*.07;//
        System.out.println(number);














    }
}
