package Leetcode_Ds_from_scratch.array_and_string;

import Dailysum.jan25.asteroidcollision;
import Skillrack.display;

public class removeDuplicatesFromSortedArray {

    private static void removeDuplicate(int[]arr){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        for(int i1=0;i1<i;i1++){
            System.out.println(arr[i1]);
        }
    }


    private static void remdup2(int[]arr){
        int l=0;
        for(int r=0;r<arr.length;r++){
            if(arr[l]!=arr[r]){
                l++;
                arr[l]=arr[r];
            }
        }
    }

    private static void removedip(int[]arr){
        int l=0;
        for(int r=0;r<arr.length;r++){
            if(arr[l]!=arr[r]){
                l++;
                arr[l]=arr[r];
            }
        }
        
    }
    public static void main(String[] args) {
        int[]arr={1,2,2,3,4,5,5,6};
        removeDuplicate(arr);
    }
}
