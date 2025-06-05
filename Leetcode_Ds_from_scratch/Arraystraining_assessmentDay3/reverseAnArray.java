package Leetcode_Ds_from_scratch.Arraystraining_assessmentDay3;


import Shit_Skillrack.display;

public class reverseAnArray {

    private static int[] Reverse(int[]arr){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
        
    }
    public static void main(String[] args) {
        int[]arr ={1,2,3,4,5,6,7};
        Reverse(arr);
        display.display1D(arr);
        
    }
}
