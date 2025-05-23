package Leetcode_Ds_from_scratch.array_and_string;

public class kadanes_also {


    private static void maxSubarray(int[]arr){
        int currentSum=0;
        int maxSum =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            
            if(currentSum+arr[i]>arr[i]){
                currentSum+=arr[i];
            }
            else{
                currentSum=arr[i];
            }
           maxSum=Math.max(maxSum, currentSum); 

        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int[]arr={-2,1,-3,4,-1,2,1,-5,4};
        maxSubarray(arr);
    }
}
