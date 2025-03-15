package Dailysum.march;

import BinarySearch.upperbound;
import Dailysum.DigitalBasics.primeNumber;

public class lowerandupperbound {


    private static int lowerbound(int[]arr , int target){
        int left = 0;
        int right =arr.length;

        while (left<right) {
            int mid= left+(right-left)/2;
            if(arr[mid]<target){
                left=mid+1;
            }else{right=mid;}
        }

        return left;
    }

    private static int Upperbound(int[]arr,int target){
         int left =0;
         int right=arr.length;

         while (left<right) {
            int midd = left+(right-left)/2;

            if(arr[midd]<=target){
                left=midd+1;
            }
            else{
                right=midd;
            }
         }
         return left;
    }

    public static void main(String[] args) {
        int[]arr= {-2,-1,-1,1,2,3};
        int x = lowerbound(arr, 0);
        int y= arr.length-Upperbound(arr,0);
        
        System.out.println(Math.max(x, y));
    }
}