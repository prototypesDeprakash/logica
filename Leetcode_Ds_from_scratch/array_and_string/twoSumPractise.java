package Leetcode_Ds_from_scratch.array_and_string;

import java.util.HashMap;

public class twoSumPractise {

    private static int[] twoSum(int[]arr,int target){
        HashMap<Integer,Integer> mymap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement  = target-arr[i];
            if(mymap.containsKey(complement)){
                return new int[]{mymap.get(complement),i};
            }
            mymap.put(arr[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        
    }
}
