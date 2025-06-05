package Leetcode_Ds_from_scratch.Arraystraining_assessmentDay3;

import Shit_Skillrack.display;

public class moveZerostoEnd {
    private static void moveZeros(int[]arr){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[i]!=0){
                i++;
            }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    public static void main(String[] args) {
        int[]arr={0,0,0,1,2,3,0,1,0,4,0,4,0,0,0,0,0,1,2,9};
        moveZeros(arr);
        display.display1D(arr);
    }
}
