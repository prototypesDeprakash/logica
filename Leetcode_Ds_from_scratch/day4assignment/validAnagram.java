package Leetcode_Ds_from_scratch.day4assignment;

import java.util.Arrays;

public class validAnagram {
        private static boolean ismyAnagram(String s1 , String s2){
        int[]fq1 = new int[26];
        int[]fq2 = new int[26];
        for(int i=0;i<s1.length();i++){
            fq1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            fq2[s2.charAt(i)-'a']++;  
        }
        for(int i=0;i<fq1.length;i++){
            if(fq1[i]!=fq2[i]){
                return false;
            }
        }
        return true;
        }
    public static void main(String[] args) {
       
    }
}
