package Leetcode_Ds_from_scratch.array_and_string;

public class largestorsmallestnumber {


    private static int max_n(int[] arr){
        int x=arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<x){
                x=arr[i];
            }
        }
        return x;
    }
    private static int min_n(int[] arr){
int x=arr[0];
       
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                x=arr[i];
            }
        }
        return x;
    }
    public static void main(String[] args) {
        int[]arr ={1,2,3,4,5,6,7,-4,-9,99};
        System.out.println(max_n(arr));
        System.out.println(min_n(arr));

    }
}
