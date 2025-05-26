package Leetcode_Ds_from_scratch.array_and_string;

public class kadanes {


    private static int longest_subarray_sum(int[]arr){
        int cur_sum=0;
        int max_sum=0;
        for(int i=0;i<arr.length;i++){
            cur_sum=Math.max(cur_sum+arr[i], arr[i]);
            max_sum=Math.max(max_sum, cur_sum);
        }
        return max_sum;
    }
    public static void main(String[] args) {
        
    }
}
