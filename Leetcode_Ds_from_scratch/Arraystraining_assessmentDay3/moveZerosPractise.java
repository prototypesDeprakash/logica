package Leetcode_Ds_from_scratch.Arraystraining_assessmentDay3;

import Skillrack.display;

public class moveZerosPractise {

    private static int[] sol1(int[]arr){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }

        }
        return arr;
    }
    public static void main(String[] args) {
        int[]arr={0,0,1,0,2,0,3,0,4,0,5,0,0,0,0,6,7,8,0};
        display.display1D(sol1(arr));
        
    }
}
