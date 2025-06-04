package Leetcode_Ds_from_scratch.Arraystraining_assessmentDay3;

import java.util.HashMap;

import Leetcode_Ds_from_scratch.array_and_string.twoSumOptimal;

public class twosum {

    private static int[] Two_sum_optimal(int[]arr,int target){
        HashMap<Integer, Integer> mymap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complelement = target-arr[i];
            if(mymap.containsKey(complelement)){
                return new int[]{mymap.get(complelement),i};
            }
            mymap.put(arr[i], i);
        }
        return new int[]{};

    }
    public static void main(String[] args) {
        int[]nums={2,9,7,0};
        int target=9;
        System.out.println(Two_sum_optimal(nums, target)[0]);
        System.out.println(Two_sum_optimal(nums, target)[1]);
    }
}
