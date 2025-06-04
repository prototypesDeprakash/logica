package Leetcode_Ds_from_scratch.array_and_string;

import Shit_Skillrack.display;

public class leftrotateArray {


private static void sol1(int[]arr){
    int fe=arr[0];
    for(int i=0;i<arr.length-1;i++){
        arr[i]=arr[i+1];
        
    }
    arr[arr.length-1]=fe;

  
}
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        sol1(arr);
        sol1(arr);
          display.display1D(arr);
    }
}
