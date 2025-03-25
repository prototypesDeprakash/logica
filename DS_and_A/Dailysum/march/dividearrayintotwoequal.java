package Dailysum.march;

import java.util.HashMap;
import java.util.Map;

public class dividearrayintotwoequal {

    private static boolean sol1(int[]arr){
        HashMap<Integer,Integer> mymap = new HashMap<>();
        for(int n :arr){
            mymap.put(n,mymap.getOrDefault(n, 0)+1);
        }
       // System.out.println(mymap);

        for(int x: mymap.values()){
            if(x%2!=0){
                return false;
            }
        }
        return true;

       
    }
    public static void main(String[] args) {
        int[]nums={1,2,3,4};
        System.out.println(sol1(nums));
    }
}