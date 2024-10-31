package BasicPattern.arrayrecall;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * checkiftwoarraysaresorted
 */
public class checkiftwoarraysaresorted {
    private static  int findmin(int[]arr){
        int x =Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<x){
                x=i;
            }
        }
        return x;
    }

    private static void solution1(int[]arr ){
        
      int startpos = findmin(arr);
      for(int i =0;i<arr.length;i++){
        if()
      }
        //if r reaches nd 

    }
    public static void main(String[] args) {
        int []arr = {2,1,3,4};

    }
}