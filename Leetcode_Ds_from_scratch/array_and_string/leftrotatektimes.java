package Leetcode_Ds_from_scratch.array_and_string;

import Skillrack.display;

public class leftrotatektimes {


    private static void left_rotate(int[]arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }

    private static int[] reverse(int[]arr,int start , int end){
         int l=start;
        int r=end;
        while (l<r) {
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        left_rotate(arr, 2);
        display.display1D(arr);
    }
}
