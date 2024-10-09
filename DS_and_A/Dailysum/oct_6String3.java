package Dailysum;

import java.sql.SQLFeatureNotSupportedException;

public class oct_6String3 {
    private static void display(String[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    private static boolean solution(String s1 , String s2){
        if(s1.length()>s2.length()){
            String temp;
            temp=s1;
            s1=s2;
            s2=temp;
        }
       
        String []words1=s1.split(" ");
        String[] words2 = s2.split(" ");
        display(words1);
        display(words2);

        //prefix match 
        int l =0;
        while (l<words1.length) {
            if(words1[l].equals(words2[l])){
                l++;
            }
            else{
                break;
            }
        }
      //suffix

      int r1=words1.length-1;
      int r2=words2.length-1;
      int s=0;
      while (r1 >= l && words1[r1].equals(words2[r2])) {
        r1--;
        r2--;
        s++;
    }
       
     
      return l+s == words1.length  ;
        
      }
public static void main(String[] args) {
    String s1="Ogn WtWj HneS";
    String s2="Ogn WtWj HneS";
   System.out.println( solution(s1, s2));
}
    
}
