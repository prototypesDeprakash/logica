package Leetcode_Ds_from_scratch.array_and_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class longestSubarrayEqualtoK {

    private static int sol1(int[]arr,int k){
          int maxsum=0;
        
        for(int i=0;i<arr.length;i++)  {
            ArrayList<Integer> mylist  = new ArrayList<>();
            int cursum=0;
          
            for(int j=i;j<arr.length;j++){
                cursum+=arr[j];
                if(cursum==k){
                    maxsum=Math.max(maxsum, j-i+1);
                }


            }
            
        }  
        return maxsum;
    }
    public static void main(String[] args) {
      //  nums = [1, -1, 5, -2, 3],  k = 3
      int[]arr={1,-1,5,-2,3};
      int k=3;
      System.out.println(sol1(arr, k));


    }
}
