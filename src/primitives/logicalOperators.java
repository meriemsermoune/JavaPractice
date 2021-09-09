package primitives;

public class logicalOperators {
    public static void main(String[]args){

        int myAge= 15;
        boolean myDress= true;
        int ageRequirement =21;
        boolean dressCode= true;
        boolean canIattend=myAge >= ageRequirement && myDress == dressCode;
        System.out.println(canIattend);// false
        myAge= 21;
        boolean canIAttend1= myAge>=ageRequirement && myDress==dressCode;
        System.out.println(canIAttend1);// true
        //=================
        int newAge= 28;
        boolean myMoney=false;
        int Agereq=18;
        boolean moneyReq=true;
        boolean canIGo= newAge>= ageRequirement || myMoney==moneyReq;
        System.out.println(canIGo);// true
        newAge= 8;
        canIGo= newAge>= ageRequirement || myMoney==moneyReq;
        //











    }
}
