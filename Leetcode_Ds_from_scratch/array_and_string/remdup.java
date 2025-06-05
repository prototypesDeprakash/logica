package Leetcode_Ds_from_scratch.array_and_string;

import Skillrack.display;

public class remdup {

    private static void remdu(int[]arr){
        int l=0;
        for(int r=0;r<arr.length;r++){
            if(arr[l]!=arr[r]){
                l++;
                arr[l]=arr[r];
            }
        }

        for(int i=0;i<l;i++){
            System.out.println(arr[i]);
        }
    }

    private static void moveZero(int[]arr){
        int l=0;
        for(int r=0;r<arr.length;r++){
            if(arr[r]!=0){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
            }
        }
        display.display1D(arr);
    }
public static void main(String[] args) {
    int[]arr={1,1,2,0,0,2,2,3,0,0,0,0,3,3,3,4,0,0,0,0,4,4,4};
    remdu(arr);
    moveZero(arr);

}
}
