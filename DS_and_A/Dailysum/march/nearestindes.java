package Dailysum.march;

import Shit_Skillrack.display;

public class nearestindes {


    private static int findFirstIndex(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return i; // Return the first index where k is found
            }
        }
        return -1; // Return -1 if k is not found
    }
    private static void sol1(int[]arr, int[]query){
        int[] res_arr= new int[query.length];
        for(int i=0;i<query.length;i++){
            int tofind=arr[query[i]];
            res_arr[i]=findFirstIndex(arr, tofind)-i;
        }

        display.display1D(res_arr);
    }
    public static void main(String[] args) {
        int[]nums={1,3,1,4,1,3,2};
        int[] query={0,3,5};
        sol1(nums, query);
    }
}
