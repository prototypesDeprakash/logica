package Leetcode_Ds_from_scratch.array_and_string;

public class findDuplicatenumber {

    private static int findDuplicate(int[]arr){
        int xorall=0;
        int xorrange=0;
        for(int i=0;i<arr.length;i++){
            xorall^=arr[i];
        }for(int i=1;i<arr.length;i++){
            xorrange^=i;
        }
        return xorall^xorrange;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,6,4,5,6};
        System.out.println(findDuplicate(arr));

    }
}
