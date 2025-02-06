package Dailysum.feb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class oneswapisallittakes {
    private static boolean ispossible(String s1,String s2){
        int[]freqarr1=new int[26];
        int[]freqarr2=new int[26];
        int dif=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                dif++;
                if(dif>2)return false;
            }
        }
        for(int i=0;i<s1.length();i++){
            freqarr1[s1.charAt(i)-'a']++;
            freqarr2[s2.charAt(i)-'a']++;
        }
        
        
         return Arrays.equals(freqarr1, freqarr2);
    }

    private static boolean sol1(String s1,String s2){
        if (s1.length() != s2.length()) {
            return false;  // Strings must be of equal length
        }
        TreeMap<Character,Integer> mymap = new TreeMap<>();
        TreeMap<Character,Integer> mymap2 = new TreeMap<>();

        for(int i=0;i<s1.length();i++){
            mymap.put(s1.charAt(i)  , i);
            mymap2.put(s2.charAt(i), i);

        }
        int ec=0;

        int finS1[]= mymap.values().stream().mapToInt(Integer::intValue).toArray();
        int finS2[]= mymap2.values().stream().mapToInt(Integer::intValue).toArray();
        for(int i=0;i<s1.length();i++){
            if(finS1[i]!=finS2[i]){
                ec++;
            }
        }

        if(ec==0 || ec==2){
            return true;
        }
        return false;
        
    }

    private static void sol2(String s1 , String s2){

        ArrayList<Integer> finres = new ArrayList<>();
        ArrayList<Integer> finres2= new ArrayList<>();

        for(int i=0;i<s1.length();i++){
            finres.add(i);
            finres2.add(i);

        }
        
    }
    public static void main(String[] args) {
        String  s1 = "attack";
        String s2 = "defend";
        System.out.println(sol1(s1, s2));
    }
}
