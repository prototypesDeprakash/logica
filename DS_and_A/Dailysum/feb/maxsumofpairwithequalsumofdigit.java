package Dailysum.feb;

import java.util.HashMap;

import recursion_core.fibbonacci;

public class maxsumofpairwithequalsumofdigit {

    private static int digitsum(int n){
        int res=0;
        while (n!=0) {
            
            res+=n%10;
            n=n/10;

        }
        return res;
    }

    private static int sol1(int[]arr){
        int res=-1;
        boolean f=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(i!=j){
                    if(digitsum(arr[i]) == digitsum(arr[j])){
                      
                            res=Math.max(res, arr[i]+arr[j]);
                            f=true;
                    }
                }

            }  

        }
        if(f){return res;} return -1;
    }

    private static int optimalSolution(int[]arr){
        HashMap<Integer, Integer> mymap = new HashMap<>();
        int maxsum = -1;
        for(int i=0;i<arr.length;i++){
            if(mymap.containskey(digitsum(arr[i]))){
                maxsum=Math.max(mymap.get(digitsum(arr[i])) + arr[i], maxsum);
                if(mymap.get(digitsum(arr[i]))<arr[i] ){
                    mymap.put(digitsum(arr[i]), arr[i]);
                    mymap.co
                }
            }
            mymap.put(digitsum(arr[i]), arr[i]);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int nums[]= {4,6,10,6};
        optimalSolution(nums);
        System.out.println(sol1(nums));
    }
}