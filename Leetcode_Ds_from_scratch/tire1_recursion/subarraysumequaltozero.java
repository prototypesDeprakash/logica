package Leetcode_Ds_from_scratch.tire1_recursion;

public class subarraysumequaltozero {


    private static void subarray_equalto_zero(int[]arr){
        int c=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                 if(sum==0){
                c++;
            }
            }   
           
        }
    }
    public static void main(String[] args) {
        
    }
}
