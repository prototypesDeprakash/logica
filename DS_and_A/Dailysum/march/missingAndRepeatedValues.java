package Dailysum.march;

import java.util.HashSet;

import Skillrack.display;

public class missingAndRepeatedValues {
    private static int[][] sol1(int [][]arr){
        int n = arr.length;
        HashSet<Integer> myset = new HashSet<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int duplicate=0;
        int missing=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //System.out.print(arr[i][j]+" ");
                max=Math.max(max, arr[i][j]);
                min=Math.min(min, arr[i][j]);
                if(myset.contains(arr[i][j])){
                    duplicate=arr[i][j];
                }
                myset.add(arr[i][j]);
            }
        }
        for(int i=min;i<=max;i++){
            if(!myset.contains(i)){
                missing=i;
                break;
            }
            if(i==max && min!=1){
                missing=max+1;
            }else{
                missing=min-1;
            }
        }
        return new int[][] {{duplicate},{missing}};
    }
    public static void main(String[] args) {
        int[][]arr ={{1,3},{2,2}};
        sol1(arr);
       // display.display2D(sol1(arr));

    }
}
