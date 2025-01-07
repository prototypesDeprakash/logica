package Dailysum.jan25;

import java.util.HashMap;

public class jan4Uniquelength3 {

    private static void sol1(String s){
        HashMap<Character,Integer> mymap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            mymap.put(s.charAt(i), mymap.getOrDefault(s.charAt(i), 0)+1);
        }
        int res=0;
       for(Integer value : mymap.values()){
        if(value>0){
            if(value==3){
                res+=1;
            }
            res+=value-1;
        }
       }
        System.out.println(res);
    }


    private static void sol2(String s){
        
    }


    public static void main(String[] args) {
    String s = "bbcbaba";
    sol1(s);
    }
}