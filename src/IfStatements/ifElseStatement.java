package IfStatements;

import java.util.Scanner;

public class ifElseStatement {
    public static void main(String[]args){

       /* There is a course that user need to pass
        User got three test scores for this course
        To be able to print/show users Letter grade
        -Ask User to provide those three test scores as integer between 0 to 100
                -find the average of the provided test scores
                -Based on the average score
        - if the average is 90 to 100 --> print 'Your average test score is <average> and letter grade is A'
                - if the average is 80 to 89 --> print 'Your average test score is <average> and letter grade is B'
                - if the average is 70 to 79 --> print 'Your average test score is <average> and letter grade is C'
                - if the average is 60 to 69 --> print 'Your average test score is <average> and letter grade is D'
                - if the average is less than 60 --> 'You need to take this course again!!'
                */

       Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the three test scores between 0-100");
        int FirstScore=scanner.nextInt();
        int secondScore=scanner.nextInt();
        //System.out.println("please enter your second test score between 0-100");
    int thirdScore= scanner.nextInt();
        //System.out.println("please enter your third test score between 0-100");
    int average=(FirstScore+secondScore+thirdScore) /3;

    if (average>=90 && average<=100){
        System.out.println("your average test score is"+ average+ "and letter grade is A");
    } else if(average>=80 && average<90) {
        System.out.println("your average test score is" + average + "and letter grade is B");
    }else if (average>=70 && average<80) {
        System.out.println("your average test score is" + average + "and letter grade is C");
    }else if(average>=60 && average<70) {
        System.out.println("your average test score is" + average + "and letter grade is D");
    }else {
        System.out.println("you need to take this course again");
    }















    }
}






























