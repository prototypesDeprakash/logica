package Leetcode_Ds_from_scratch.tire1_recursion;

import Skillrack.display;

public class reversearray {

    private static void reverse_array(int[]arr , int start , int end){
        //basecase??
        if(start>end){
            return;
        }
        int temp =arr[start];

        arr[start]=arr[end];
        arr[end]=temp;

        reverse_array(arr,start+1,end-1);
        //minimum step to do
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        reverse_array(arr, 0,5);
        display.display1D(arr);
    }
}
