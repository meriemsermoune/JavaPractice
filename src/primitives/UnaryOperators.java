package primitives;

public class UnaryOperators {
    public static void main(String[]args){
        int studentNumber=25;
        studentNumber=studentNumber+1;
        studentNumber+=1;
        studentNumber++;
        System.out.println(studentNumber);

        studentNumber--;
        System.out.println(studentNumber);//27
        studentNumber--; studentNumber-- ; studentNumber--;
        System.out.println(studentNumber);//24
        //=====================
        studentNumber++;
        studentNumber--;
        System.out.println(studentNumber++);// it is supposed to show 25 but it shows 24 because in prinln it shows the value with
        //without ++

        System.out.println(studentNumber);// shows 25 because there is no ++/ shows the real value
        System.out.println(++studentNumber);// it shows 26 , increase first then prints out
        System.out.println(studentNumber--);// it shows 26 then decrease by one;25
        studentNumber--; //24
        --studentNumber;//23
        System.out.println(--studentNumber);// decrease first 22 then shows 22
        System.out.println(studentNumber);//print 22
        int a= studentNumber++ + studentNumber++ +5;
        a--;
        a=studentNumber;// a=24
        System.out.println(a--);// shows 24 and give value of a as 23
        System.out.println(a--);// shows 24, a=23






















    }
}
