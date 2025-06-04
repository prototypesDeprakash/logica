package Leetcode_Ds_from_scratch.array_and_string;

import java.util.HashMap;

import Shit_Skillrack.display;

public class twoSumOptimal {

    private static int[] sol1(int[]arr,int target){
        HashMap<Integer,Integer> mymap = new HashMap<>();
        int[]res = new int[2];
        for(int i=0;i<arr.length;i++){
            int complement = target - arr[i];
            if(mymap.containsKey(complement)){
                return new int[]{mymap.get(complement),i};
               
            }
            else{
                mymap.putIfAbsent(arr[i], i);
            }
        }
        return new int[2];
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,7,4,5};
        int target =9;
        sol1(arr, target);
    }
}
