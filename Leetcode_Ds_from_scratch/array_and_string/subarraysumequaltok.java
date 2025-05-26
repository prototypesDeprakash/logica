package Leetcode_Ds_from_scratch.array_and_string;

public class subarraysumequaltok {

    //bruitforce
    private static int subarr_Sum(int[]arr,int target){
        int c=0;
        for(int i=0;i<arr.length;i++){

            int sum=0;
            for(int j=i;j<arr.length;j++){
                 sum += arr[j];
                if(sum==target){
                    c++;
                }
            }
        }
        return c;
    }

    //works only for positive values
    private static int subarr_sum_2(int[]arr,int target){
        int start = 0;
        int end =0;
        int sum=arr[0];
        int c=0;
        while (start<arr.length) {
           if(arr[start]>arr[end]){
            
           }
        }
    }
    public static void main(String[] args) {
        int[]arr={1,1,1};
        int k=2;
        System.out.println(subarr_Sum(arr, k));
        System.out.println(subarr_sum_2(arr,k));
    }
}
