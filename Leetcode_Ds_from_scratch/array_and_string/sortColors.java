package Leetcode_Ds_from_scratch.array_and_string;

import Shit_Skillrack.display;

public class sortColors {

    private static void flag_sort(int[]arr){
        int l=0;
        int m=0;
        int h=arr.length-1;
        while (m<=h) {
            if(arr[m]==0){
                int temp=arr[m];
                arr[m]=arr[l];
                arr[l]=temp;
                l++;
                m++;
            }else if(arr[m]==1){
                m++;
            }else if(arr[m]==2){
                int temp=arr[h];
                arr[h]=arr[m];
                arr[m]=temp;
                h--;
            }

        }
        display.display1D(arr);
    }
    public static void main(String[] args) {
        int[]arr={0,1,1,1,2,2,2,0,0,1,1,2,0,0,2,1};
        flag_sort(arr);

    }
}
