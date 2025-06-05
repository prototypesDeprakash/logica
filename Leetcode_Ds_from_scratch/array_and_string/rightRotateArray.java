package Leetcode_Ds_from_scratch.array_and_string;

import Skillrack.display;

public class rightRotateArray {
    private static void rightRotateArray(int[]arr){

        //last element first la varanum
        int le=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=le;

    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};

        rightRotateArray(arr);
        rightRotateArray(arr);
        display.display1D(arr);
    }
}
