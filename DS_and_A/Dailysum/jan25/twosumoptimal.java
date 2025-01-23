package Dailysum.jan25;

import java.util.HashMap;

public class twosumoptimal {

    private static int[] sol1(int[]arr , int target){
        HashMap<Integer,Integer> myMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complememt = target-arr[i];
            if(myMap.containsKey(complememt)){
               return new int[] {myMap.get(complememt),i};
            }
            myMap.put(arr[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        
    }
}
