package Dailysum.dailysolved;

import java.util.HashMap;
import java.util.Map;
public class learnhashmap {

    private static void hm(){
            HashMap<Integer,Integer> mymap= new HashMap<>();

            mymap.put(1, 9);
            mymap.put(2, 8);
            mymap.put(3, 73);
        int myval = 9;

       // System.out.println(mymap.get(1));
        for(Map.Entry<Integer,Integer> entry :mymap.entrySet()){
         //   System.out.println(entry);
            if(entry.getValue().equals(myval)){
                System.out.println(entry.getKey());
                break;
            }
        }
       System.out.println(mymap.entrySet());

       // System.out.println(mymap);

    }
    public static void main(String[] args) {
        hm();
    }
}
