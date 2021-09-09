package homeWorks;

public class firstHomeWork {
    public static void main(String[]args){
        //task 1

                int myAge=  28;
                float myHeight= 1.74f;
                int myWeight= 75;
                System.out.println("myAge="+myAge);
                System.out.println("my height="+myHeight);
                System.out.println("my weight="+ myWeight);
                System.out.println("my age is=" + myAge+"my weight is="+ myWeight+ "my height is=" + myHeight);





        //task 2 calculating the BMI
        float myHeightInMeter2= myHeight*myHeight;
        System.out.println("my BMI is="+ myWeight/myHeightInMeter2);
        float BMI= myWeight/myHeightInMeter2;


        System.out.println("my BMI is="+ BMI/myHeight);
        //task3
        float pound=2.205f;
        float myWeightInPound= myWeight*pound;
        System.out.println("my weight in pound is="+ myWeightInPound);


        double gram= 1000d;
        double myWeightInGram= myWeight*gram;
        System.out.println("My weight in gram is="+ myWeightInGram);
        //task4
        float ft= 3.28f;
        int cm= 100;
        float myHeightInFoot= myHeight*ft;
        double myHeightInCm= myHeight*cm;
        System.out.println("My height in foot is="+ myHeightInFoot);
        System.out.println("My height in cm is="+ myHeightInCm);

        //task5
        double degreeInFah= 590;
        double conversion= (degreeInFah-32)*5/9;
        double degreeInC= conversion;
        System.out.println("degree in C is="+ degreeInC);







































            }
        }




