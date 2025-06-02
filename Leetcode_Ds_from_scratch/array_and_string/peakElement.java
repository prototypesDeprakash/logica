package Leetcode_Ds_from_scratch.array_and_string;

public class peakElement {


    
    private static int sol1(int[]arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
}