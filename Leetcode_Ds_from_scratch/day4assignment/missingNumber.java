package Leetcode_Ds_from_scratch.day4assignment;

import java.util.HashSet;

public class missingNumber {

    //optimal solution (i guess)
    private static int formula_Approach(int[]arr){
        int total=0;
        int total_array=0;
        int m=arr.length;
        for(int i=0;i<arr.length;i++){
           
            total_array+=arr[i];
        }
        total=(m*(m+1)/2 );
        return total-total_array;

    }
    //hash set approach
    private static int hashSetApproach(int[]arr){
        HashSet<Integer> myset  = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            myset.add(arr[i]);
        }
        for(int i=0;i<=arr.length;i++){
            if(!myset.contains(i)){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[]arr={9,6,4,2,3,5,7,0,1};
        System.out.println(formula_Approach(arr));
        System.out.println(hashSetApproach(arr));
    }
}
