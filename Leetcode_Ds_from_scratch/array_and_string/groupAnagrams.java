package Leetcode_Ds_from_scratch.array_and_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams {

    private static String getFrequencyString(String str){
        int[]freq = new int[26];
        for (char c:str.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder sb = new StringBuilder("");
       for(int i=0;i<26;i++){
        if(freq[i]>0){
            sb.append((char)('a'+i));
            sb.append(freq[i]);
        }
       }
        return sb.toString();
    }

    private static ArrayList ga(String[]arr){
        HashMap<String,List<String>> mymap = new HashMap<>();
        for(String s :arr){
          if(mymap.containsKey(getFrequencyString(s))){
            mymap.get(getFrequencyString(s)).add(s);
          }
          else{
            List<String> strlist  = new ArrayList<>();
            strlist.add(s);
            mymap.put(getFrequencyString(s), strlist);
          }
        }
        return new ArrayList<>(mymap.values());
    }
    public static void main(String[] args) {
        String[]strs = {"eat","tea","tan","ate","nat","bat"};
        System.err.println(ga(strs));
    }
}
