package variables;

public class practice2 {
    public static void main(String[]args){
        /* in a farm there are 12 cows and 23 chicken. each chicken costs 10$ and each cow costs 500$
        1= calculate the number of both chickens and cows legs.
        2= what is the cost of animals in the farm
         */
        int chicken=23;
        int cow=12;
        int chickenLeg= 2;
        int cowLeg=4;
        int totalChickenLegs= chicken*chickenLeg;
        int totalCowsLegs= cow*cowLeg;
        System.out.println("total legs of chickens and cows is="+ (totalChickenLegs+totalCowsLegs));
        int chickenCost=10;
        int cowCost= 500;
        int totalChickenCost= chicken*chickenCost;
        int totalCowCost= cow*cowCost;
        System.out.println("total cost of the animals in the farm=" + (totalChickenCost+totalCowCost));







    }
}
