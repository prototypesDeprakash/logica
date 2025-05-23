package Leetcode_Ds_from_scratch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class hashmapBasics {


    private static String Hashmap_Create(String s){

        char[]arr=s.toCharArray();
        HashMap<Character,Integer> mymap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mymap.put(arr[i], mymap.getOrDefault(arr[i],0)+1);
        }

      //iterate and print the key or value form the hashmap
        for(Map.Entry<Character,Integer> entry : mymap.entrySet()){
            System.out.println(entry.getValue());
        }
    //sorting the hashmap 
    //step1: convert to list
    List<Map.Entry<Character,Integer>> entryList = new ArrayList<>(mymap.entrySet());
    System.out.println(entryList);
    //step2: sort in ascending order
    //entryList.sort(Map.Entry.comparingByValue());
    //descending order sorting

    entryList.sort((e1,e2)->e2.getValue().compareTo(e1.getValue()));
    //step3:print
   System.out.println(entryList );
   String finalResult="";
    for(Map.Entry<Character,Integer> entry :entryList){
        System.out.println(entry.getKey() +" "+ entry.getValue());
        char k = entry.getKey();
        for(int i=0;i<entry.getValue();i++){
            finalResult+=k;
        }
    }
return finalResult;

        
    }

    public static void main(String[] args) {
        String s="cccaaa";
        Hashmap_Create( s);
    }
}