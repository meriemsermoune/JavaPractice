package String;

public class stringBasics {
    public static void main(String[]args){
        String text="School";
        String name= new String("Meriem");// put meriem as a value
                System.out.println(text);
                System.out.println(name);// shows nothing because we didn't give value to name
        // when we add meriem as a value when we run the class it shows as meriem
        System.out.println(name);
        text=text+ "is Techtorial";
        System.out.println(text);
        text+= "academy";// school is techtorial academy
        System.out.println(text);

        // text-= "academy" this will not work because the plus sign is not mathematical +
        // placing one string before the other string
        // and combining them together is called string concatenaion(adding them together)
        String word= name + text;
        System.out.println(word);// meriem school is techtorial academy
        System.out.println(word+"5");// meriem school is techtorial academy5
        System.out.println(word);// meriem school is techtorial academy
        name= name+text;
        name+=text;
        System.out.println(name);


        String str= "java";
        String str1="selenium";
        String result=str+" " + str1;
        System.out.println(result);// javaselenium without space in between the texts
        // when we add " " it will print space between texts
        System.out.println(result);
        System.out.println(str1+ "is next");
        System.out.println(str+ "is first");
        System.out.println(result + str +str1);// java selenium javaselenium
        str= str+5+6;
        System.out.println(str);// java56

        str1=str1+"5"+"6";
        System.out.println(str1);// selenium56
        result=5+6+result;
        System.out.println(result);//11 java selenium//because numbers were before


        str="java";
        int a=12;
        str.concat("is cool");
        System.out.println(str);

        str=str.concat("  is very easy");
        System.out.println(str);





















































    }
}
