package Leetcode_Ds_from_scratch.array_and_string;

import Skillrack.display;

public class zerotoend {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,0,34,0,0,43,5,6,0,0,43,2,3,4};
        int l=0;
        
        for(int r=0;r<arr.length;r++){
            if(arr[r]!=0){
            int tmp=arr[l];
            arr[l]=arr[r];
            arr[r]=tmp;
            l++;
            }
        }
        display.display1D(arr);
    }
}
