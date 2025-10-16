package Leetcode_Ds_from_scratch.javaOutputPrediction;

import java.util.HashMap;

public class freqcount {


    private static void counts(String s){
        int[]freq  = new int[26];
        HashMap<Character,Integer>myma = new HashMap<>();
        for (char c:s.toCharArray()){
            myma.put(c, myma.getOrDefault(c, 0)+1);
        }
        for(char c :s.toCharArray()){
            freq[c-'a']++;

        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.print(freq[i]+" ");
            }
        }

        System.out.println(myma);


    }
    public static void main(String[] args) {
        String s ="aabbaacc";
        counts(s);
    }
}