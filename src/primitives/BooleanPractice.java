package primitives;

public class BooleanPractice{
    public static void main(String[]args){

// for a boolean data type you can only give value of true or false

        boolean isLightOn = true; // true means it is working
        boolean isBreakTime;

        isBreakTime = isLightOn;

        System.out.println(isLightOn);
        System.out.println(isBreakTime);

        int num = 6;
        System.out.println(num);

        int num1 = num;
        System.out.println(num1);

        boolean isClear = false;// false means something is not working. it is wrong


        System.out.println(isClear);
        //   System.out.println(isBreakTime+isClear); // it will not compile
        System.out.println("!!!" + isBreakTime + isClear);
        int i1= 5;
        int I2=5;//i1==i2
        int i3=10;
        // does i1 equal i3= no false
        boolean isi1EqualtoI2= i1==I2;
        System.out.println(isi1EqualtoI2);



    }

}





















