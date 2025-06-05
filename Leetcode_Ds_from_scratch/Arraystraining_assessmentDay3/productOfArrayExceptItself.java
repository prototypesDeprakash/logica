package Leetcode_Ds_from_scratch.Arraystraining_assessmentDay3;

import Shit_Skillrack.display;

public class productOfArrayExceptItself {

    private static int[]product_of_arr(int[]arr){ //doesnt work if array ahs zeros
        int total_product=1;

        for(int i=0;i<arr.length;i++){
            total_product*=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=total_product/arr[i];
        }
        return arr;
    }

    //product of all elements on left * product of all elements on right
    private static int[]product_of_arr_exceptItself(int[]arr){
        int[]leftproduct = new int[arr.length];
        int[]rightproduct = new int[arr.length];
        leftproduct[0]=arr[0];
        rightproduct[arr.length-1]=arr[arr.length-1];
        for(int i=1;i<arr.length;i++){
            leftproduct[i]=arr[i]*leftproduct[i-1];
        }
        for(int i=arr.length-1;i>1;i--){
            rightproduct[i]=rightproduct[i-1]*arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=leftproduct[i]*rightproduct[i];
        }
        return arr;

    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        //display.display1D(product_of_arr(arr));
        display.display1D(product_of_arr_exceptItself(arr));
    }
}
