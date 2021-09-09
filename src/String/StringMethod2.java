package String;

public class StringMethod2 {
    public static void main(String[]args){

        String name="Diana";
        //indexof

        System.out.println(name.indexOf('D'));// will show 0
        System.out.println(name.indexOf("D"));//0
        System.out.println(name.indexOf("Di"));//0  index num of D
        System.out.println(name.indexOf("ana"));//2 it looks for matching
        // sequence of provided chars and returns first matching chars index
        System.out.println(name.indexOf("tina"));//-1 there is no matching char

        name.concat("Bejan");
        System.out.println(name.concat("Bejan"));// dianabejan
        System.out.println(name);//diana
        System.out.println(name.indexOf("B", name.indexOf(" ")+1));

name="Arzu Beril Sen";
System.out.println(name.indexOf("B",name.indexOf("")));// arzu beril sen


















    }

}
