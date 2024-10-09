package Dailysum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import HashMapFull.happynumber;
import linkedlist.basic_insertionanddelete.insertinginsorted;

public class oct_5perumuinstr {

    private static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    private static boolean slidingsol1(String s1 , String s2){
        /*
         * Input: s1 = "ab", s2 = "eidbaooo"
           Output: true
           Explanation: s2 contains one permutation of s1 ("ba").
         */
      int[] s1hash =new int[26];
      int[]s2hash= new int[26];
      int left =0;int right =0;
 if (s1.length() > s2.length()) {
            return false;
        }
      //initial window 
      while (right<s1.length()) {
        s1hash[s1.charAt(right)-'a']++;
        s2hash[s2.charAt(right)-'a']++;
        right++;
      }

      //sliding widow
      while (right<s2.length()) {
        if(Arrays.equals(s1hash, s2hash)){
           return true;
        }
         s2hash[s2.charAt(right) - 'a']++;
            s2hash[s2.charAt(left) - 'a']--;
            left++;
            right++;
      }
 //     display(s1hash);
 //     display(s2hash);
       // Check for the last window
        if (Arrays.equals(s1hash, s2hash)) {
            return true;
        } 
            return false;
        


    }

    
    public static void main(String[] args) {
        String s1 ="adc";
        String s2= "dcda";
       System.out.println( slidingsol1(s1, s2));
    }
}
