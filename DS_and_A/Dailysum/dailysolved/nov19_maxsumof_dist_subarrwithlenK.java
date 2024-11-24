package Dailysum.dailysolved;

import java.util.HashSet;
import java.util.Set;

public class nov19_maxsumof_dist_subarrwithlenK {

    private static boolean checkifDistinct(int[]arr ,int start , int end){
      Set<Integer> seen = new HashSet<>();
        
        for (int i = start; i < end; i++) {
            if (seen.contains(arr[i])) {
                return false; // Duplicate element found
            }
            seen.add(arr[i]);
        }
        return true; // All elements are distinct
    }
    private static int distinctsum(int[]arr , int start , int end){
        int sum=0;
        for(int i=start;i<end;i++){
            sum+=arr[i];
        }
        return sum;
        
    }
    private static int sol1(int[]arr,int k){
        int s=0;
        int e=k;
        int res=0;
        for(int i=0;i<arr.length;i++){
            if(checkifDistinct(arr, s, e)){
                res= distinctsum(arr, s, e);
            }
           
            s++;
            e++;

            i++; //--> for loop only
        }
        return res;

    }



    private static void optimalsol(int[]arr, int k){
        
    }
    public static void main(String[] args) {
        int[]arr={1,5,4,2,9,9,9};
        int k=3;
        sol1(arr, k);
        for(int i=0;i<arr.length;i++){

        }
    }
}