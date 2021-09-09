package homeWorks;

public class HomeWork2 {
    public static void main(String[]args){
        //task1, creating char for my first letters
        char M =77;
        char E=69;
        char R=82;
        char I=73;
        System.out.println("char for my first letters is="+ M + E+R+I+E+M);


        /*
        task2
         pseudocode
        - result= we first start by the multiplication ( 4*7)

       (4*7) +3-(2*9%5/3)-2
       28+3 -(18%5 /3)
       28+3 - (3/30-2
       28+3-1-2
       28+3-3=28
       -result1= we start by dividing -3/3
       12(-3/3)+4 -(2*2%4)+(12%3/3)
       12(-1)+4-(4%4)+(0/3)
       11 +4(0)+(0)
       11 +4-1
       15-0=15
        */


        int result=4*7+3-2*9%5/3-2;//28
        int result1= 12-3/3+4-2*2%4+12%3/3;//15
        System.out.println(result);
        System.out.println(result1);


        //task3
        int A= 125;
        int B= 24;
        int num1=A+B;// 149
        int num2=A-B;//101
        int num3=A*B;//3000
        int num4=A/B;//5
        int num5=A%B;//5
        System.out.println("number1="+ num1  + "number2 is="+ num2 + "number3 is="+ num3 + "number four is="+num4 +
        "number five is="+ num5);


        //task4, area and perimeter of a rectangle
        double width=5.5;
        double height=8.5;
        double area=width*height;
        double perimeter= 2 * width+height;
        System.out.println(area);
        System.out.println(perimeter);
        System.out.println("Rectangle area is="+ area + "Rectangle perimeter is="+ perimeter);

//Task 5
        int a=6;
        int b=1;
        int number1= a*b;
        int number2= a* 2;
        int number3= a*3;
        int number4=a*4;
        int number5=a*5;
        int number6=a*6;
        int number7=a*7;
        int number8=a*8;
        int number9=a*9;
        int number10=a*10;
        System.out.println("n1="+number1+"n2="+number2+"num3="+number3+"num4="+number4+ "num5="+number5
        +"num6is"+ number6+"num7="+ number7+"number 8="+number8+"num9="+ number9+"num10="+ number10);

        //task6//
        int bobsEarning=200;
        int HalfSalary= bobsEarning/2;
        int bonus1= HalfSalary%5;
        int bobs30OfSalary= bobsEarning%30;
        int Bonus2= bobs30OfSalary%8;
        int bobs20OfSalary= bobsEarning%20;
        int bonus3= bobs20OfSalary%10;
        System.out.println("Bonus1is=" + bonus1+ "Bonus 2 is=" + Bonus2+ "Bonus 3 is=" +  bonus3);

        









        









    }
}
