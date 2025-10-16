package Leetcode_Ds_from_scratch.javaOutputPrediction;

import Skillrack.display;

public class insertionsort {

    private static void insertion(int[]arr){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j=j-1;

            }
            arr[j+1]=key;
        }
        display.display1D(arr);
    }
    public static void main(String[] args) {
        int[]arr={9,8,7,6,5,4,3,2,1};
        insertion(arr);
    }
}