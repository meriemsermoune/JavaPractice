package primitives;

public class logicalOperatorsPractice {
    public static void main(String[]args){
        /* you need to pass a course if
        you attend 95% of the classes or
        you get more than  70% as passing score out of 100

         */
        int passingReq= 95;
        int passingReq2=70;
        int myAttendance= 95;
        int myScore=80;
        boolean willIPass= myAttendance>= passingReq|| myScore>passingReq2;
        System.out.println(willIPass);//true
        System.out.println(!willIPass);//false because of the negation ! before willIPass


        //my own Practice\

        int examAnsweres= 80;
        int driving=80;
        int myAnsweres=90;
        int myDriving=80;
        boolean willIget= myAnsweres>examAnsweres && myDriving>driving;
        System.out.println(willIget);










    }
}
