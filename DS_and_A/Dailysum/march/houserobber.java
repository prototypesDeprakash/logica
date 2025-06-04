package Dailysum.march;

import Shit_Skillrack.matrixproblems25;

public class houserobber {

//wont work
    private static void sol1(int[]arr){
        int max=Integer.MIN_VALUE;

        int js=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+2;j<arr.length;j++){
                //System.out.println(arr[i]+" "+arr[j]);
                System.out.println(js+" "+j);
                js+=arr[j];


            }
            max=Math.max(max, arr[i]+js);
            js=0;

        }
       System.out.println(max);
    }

    private static void sol2(int[] arr){
        int e=0;
        int o=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                e+=arr[i];
            }else{
                o+=arr[i];
            }
        }
        System.out.println(Math.max(e, o));
    }
    public static void main(String[] args) {
        int[]nums = {2,7,9,3,1};
        sol2(nums);

    }
}