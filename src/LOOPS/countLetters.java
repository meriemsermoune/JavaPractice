package LOOPS;

public class countLetters {
    public static void main(String[]args){
        //I want to solve this question by my self this time
        //count how many lower case "i" and upper case "I" are in the sentence
        //print "there are .... in the given sentence"

        String text="I want to solve this question by my self this time iiii";
        int index=0;
        int count=0;

        while(index<text.length()){
          if(text.charAt(index)=='i'|| text.charAt(index)=='I');{
              count++;
            }

            index++;

        }
        System.out.println("there are "+count +" i or I in the sentence");












    }
}
