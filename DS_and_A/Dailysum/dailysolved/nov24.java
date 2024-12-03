package Dailysum.dailysolved;

import BasicMath.countdigits;
import Dynamic_Programming.climbingStairs;

public class nov24 {

    private static int sol1(int[]arr,int l , int r){
        int minval=Integer.MAX_VALUE;
   
       
       
        for(int i=0;i<arr.length;i++){
            int current=0;
            for (int j = i; j < arr.length && (j - i + 1) <= r; j++) 
                current+=arr[j];
                int length = j - i + 1;
                // Check if the subarray length is within [l, r] and sum > 0
                if (length >= l && current > 0) {
                    minval = Math.min(minval, current); // Update the minimum positive sum
                }
            }
          
          
        }
        return minval;
       

    }
    public static void main(String[] args) {

        int[]arr={3, -2, 1, 4};
        int l=2;
        int r=3;
        System.out.println(sol1(arr, l, r));
    }
}