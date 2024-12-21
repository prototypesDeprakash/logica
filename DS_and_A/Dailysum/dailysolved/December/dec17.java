package Dailysum.dailysolved.December;

import java.util.HashMap;
import java.util.TreeMap;

public class dec17 {

    private static String isLexographic(String s1 , String s2){
        int i=0;
        while (i<s1.length() && i<s2.length()) {
            if(s1.charAt(i)==s2.charAt(i)){
                i++;
            }
            else{
                if(s1.charAt(i)>s2.charAt(i)){
                    return s1;
                }
                else{
                    return s2;
                }
            }
        }
        if(s1.length()>s2.length()){
            return s1;
        }
        else{
            return s2;
        }
    }
    private static void buildedString(String s1,int repeattimes){
        StringBuilder s2 = new StringBuilder();
        int[] freqMap= new int[26];

        for(int i=0;i<s1.length();i++){
            freqMap[s1.charAt(i)-'a']++;
        }
        for(int i=25;i>=0;i--){
            if(freqMap[i]==0) continue;
            int mintoappend = Math.min(repeattimes, freqMap[i]);
            freqMap[i]-=mintoappend;
            while (mintoappend>0) {
                s2.append((char)freqMap[i+'a']);
                mintoappend--;
            }
            if(freqMap[i] != 0){
                for(int j=i-1; j>=0; j--){
                    if(freqMap[j] == 0) continue;
                    s2.append((char)('a' + j));
                    freqMap[j]--;
                    i++;
                    break;
                }
            }
        }
        
        System.out.println(freqMap);

    }
    public static void main(String[] args) {
        String s1="abb";
        String s2="ab";
        int repeattimes=1;
        buildedString(s1,repeattimes);
        System.out.println(isLexographic(s1, s2));
    }
}