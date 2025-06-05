package Leetcode_Ds_from_scratch.Arraystraining_assessmentDay3;

import Skillrack.display;

public class basicsArray {

    private static void insert(int[]arr , int value , int capacity ,int currentsize, int currentPosition){
        if(currentsize==currentPosition){
            System.out.println("Array has no space mf");
        }
        int index = currentPosition-1; // findex where to insert the element
        for(int i=currentsize-1;i>=index;i--){
            arr[i+1]=arr[i];

        }
        arr[index]=value;
       
    }
    public static void main(String[] args) {
        int[]arr=new int[5];
        insert(arr, 10, 5, 1, 1);
        insert(arr, 20, 5, 1, 2);

        display.display1D(arr);

    }
}