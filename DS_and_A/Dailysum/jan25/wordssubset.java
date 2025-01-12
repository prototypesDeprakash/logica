package Dailysum.jan25;

import java.util.ArrayList;
import java.util.HashMap;

import subsetAndSubsequence.checkifasubstring;

public class wordssubset {

    private static void setMaxFreq(int[] freq_words2, int[] freq) {
        for (int i = 0; i < 26; ++i) {
            freq_words2[i] = Math.max(freq_words2[i], freq[i]);
        }
    }
    private static ArrayList sol1(String[] words1,String[]words){
     
        ArrayList<String> res = new ArrayList<>();
        int []maxfreq= new int[26];
     
        for(String s :words){
            int[]count2 = new int[26];
            for(char ch :s.toCharArray()){
                count2[ch-'a' ]++;
               
                
            }
            setMaxFreq(maxfreq,count2);

        }

        for(String word :words1){
        int[]freqword1=new int[26];
            for(char ch :word.toCharArray()){
                freqword1[ch-'a']++;  
            }
            if(isunique(freqword1, maxfreq)){
                res.add(word);
            }
        }

        return res;

    }
    private static boolean isunique(int[]word1,int[]word2){
        for(int i=0;i<26;i++){
            if(word1[i]<word2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
    String[] words1 = {"amazon","apple","facebook","google","leetcode"};
    String[]words2 = {"e","o"};
   System.out.println( sol1(words1, words2));
    }
}
