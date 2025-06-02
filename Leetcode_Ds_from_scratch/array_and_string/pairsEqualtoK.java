package Leetcode_Ds_from_scratch.array_and_string;

import java.util.ArrayList;

public class pairsEqualtoK {

    public static void main(String[] args) {
        int[]arr ={1,2,3,4,5};
        int k =2;
        ArrayList<ArrayList<Integer>>myList = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j =i;j<arr.length;j++){
                if((i<j)&& Math.abs(arr[i]-arr[j]) ==k){
                    ArrayList<Integer> inner = new ArrayList<>();
                    inner.add(arr[i]);
                    inner.add(arr[j]);
                    myList.add(inner);
                }
            }
        }
        System.out.println(myList);

    }
}