package Leetcode_Ds_from_scratch.Arraystraining_assessmentDay3;

import java.util.HashSet;

public class containsDuplicate {

    private static boolean hasDuplicate(int[]arr){
        HashSet<Integer> myset = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(myset.contains(arr[i])){
                return true;
            }
            myset.add(arr[i]);
        }
        return false;    
        
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,2};
        System.out.println(hasDuplicate(arr));
    }
}
