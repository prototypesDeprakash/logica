package Leetcode_Ds_from_scratch.Arraystraining_assessmentDay3;

public class MaximumSubarray {

    private static int max_subarray(int[]arr){
        int max_ele=Integer.MIN_VALUE;
        int  cur_ele=0;
        for(int i=0;i<arr.length;i++){
            cur_ele=Math.max(arr[i],cur_ele+arr[i]);
            max_ele=Math.max(cur_ele,max_ele);
        }
        return max_ele;
    }

    public static void main(String[] args) {
        int[]arr={ -2,1,-3,4,-1,2,1,-5,4};
        System.out.println(max_subarray(arr));
    }
}