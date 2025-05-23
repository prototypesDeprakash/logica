package Leetcode_Ds_from_scratch.array_and_string;

import Skillrack.display;

public class reversingAnarray {

    private static void reverseArray(int[]arr){
        int l=0;
        int r=arr.length-1;
        while (l<r) {
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        display.display1D(arr);

    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        reverseArray(arr);

    }
}
