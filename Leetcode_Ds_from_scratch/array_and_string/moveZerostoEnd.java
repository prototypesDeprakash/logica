package Leetcode_Ds_from_scratch.array_and_string;

import Shit_Skillrack.display;

public class moveZerostoEnd {
    public static void main(String[] args) {

        int[]arr={1,2,0,0,3,4,0,5,0,6};
        int l=0;
        for(int r=0;r<arr.length;r++){
            if(arr[r]!=0){
                //swap
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                //increment left
                l++;
            }
        }
        display.display1D(arr);
    }
}
