package Leetcode_Ds_from_scratch.Arraystraining_assessmentDay3;

public class bestTimeTOBuyAndSell {
    private static int bruitForce_bestTime(int[]arr){
        int max_profit=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    max_profit=Math.max(max_profit,arr[j]-arr[i]);
                }
            }
        }
        return max_profit;
    }
    private static int oprimal_sol(int []arr){
        int l=0;
        int r= 1;
        int max_profit=0;
        while (r<arr.length) {
            if(arr[l]<arr[r]){
                max_profit=Math.max(max_profit, arr[r]-arr[l]);
            }
            else{
                l=r;
            }
            r++;
            
            
        }
        return max_profit;
    }
    public static void main(String[] args) {
        int[]arr = {7,1,5,3,6,4};
        System.out.println(bruitForce_bestTime(arr));
        System.out.println(oprimal_sol(arr));
    }
}
