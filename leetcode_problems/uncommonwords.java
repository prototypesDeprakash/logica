import java.util.ArrayList;

import javax.swing.undo.StateEdit;

/**
 * uncommonwords
 */
public class uncommonwords {

    private static int count_words(String word , String[] arr){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(word.equals(arr[i])){
                c++;
            }
        }
        return c;
    }


    public static void main(String[] args) {
        /*
         * Input: s1 = "this apple is sweet", s2 = "this apple is sour"

            Output: ["sweet","sour"]
         */

         String s1 = "this apple is sweet";
         String s2 = "this apple is sour";
         s1=s1+" "+s2;
         String[]sl1 = s1.split(" ");
         //String[]sl2 = s2.split(" ");
         
         ArrayList <String> res =  new ArrayList<>();
         for (String words : sl1){
            if(count_words(words,sl1 ) ==1){
                res.add(words);
            }
         }
         String[] ares=new String[res.size()];
         ares=res.toArray(ares);
         for(int i=0;i<ares.length;i++){
            return ares[i];
         }
        

    }
    
}