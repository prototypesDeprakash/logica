package Dailysum;

import java.util.ArrayList;

public class nov17 {
    private static boolean issorted(int start, int end, int[] arr) {
        for (int i = start; i < end; i++) {
            // Check for strict consecutive increase
            if (arr[i + 1] != arr[i] + 1) {
                return false;
            }
        }
        return true;
    }
    private static int findmax(int[]arr,int start , int end){
            int max=Integer.MIN_VALUE;
            for(int i=start;i<=end;i++){
                
                    max=Math.max(max, arr[i]);
                
            }
            return max;
    }
    
    private static void solution1(int[]arr , int k){
        //sliding window
        ArrayList <Integer> res=new ArrayList<>();

        int s=0;
        int e=k-1;
       while (e<arr.length) {
       
        
            if(issorted(s, e, arr)){
                res.add(findmax(arr, s, e));
            }
            else{
                res.add(-1);
            }
        
        s++;
        e++;
       }
       System.out.println(res);
       
    }

    public static void main(String[] args) {
        int[]arr={1,3,4};
        int k=2;
       solution1(arr, k);
       
    }
}