package Leetcode_Ds_from_scratch.array_and_string;

import java.util.HashSet;

public class missingNumber {

    private static int sol1(int[]arr){
        HashSet<Integer> myset = new HashSet<>();
        for(int n:arr){
            myset.add(n);
        }
        for(int i=0;i<arr.length;i++){
            if(!myset.contains(i)){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        
    }
}
