package Leetcode_Ds_from_scratch.array_and_string;

import Shit_Skillrack.display;

public class colorSort {
    public static void main(String[] args) {
        int[]arr={1,0,0,2,1,2,0,2,1,1,1,0,0,2,2,1,1};
        int l=0;
        int m=0;
        int h=arr.length-1;



        while (m<=h) {
            if(arr[m]==0){
                int tmp=arr[l];
                arr[l]=arr[m];
               arr[m]=tmp;
                m++;
                l++;
            }
            else if(arr[m]==1){
                m++;
            }
            else if(arr[m]==2){
                int tmp2=arr[h];
                arr[h]=arr[m];
                arr[m]=tmp2;
                h--;
                
            }
        }

        display.display1D(arr);
    }
}
