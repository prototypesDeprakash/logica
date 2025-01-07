package neetcodeBAsics;

import java.util.HashMap;

public class climbingStairs {


    private static int topdown(int n ,HashMap<Integer,Integer> cache){
        if(n==1 || n==0){
            return 1;

        }
        if(cache.containsKey(n)){
            return cache.get(n);
        }
        int res = topdown(n-1, cache)+topdown(n-2, cache);
        cache.put(n, res);
        return res;
    }
    private static int bottom_up_approach (int n){
        int[]arr= new int[n+1];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];

        }
        return arr[n];
    }
    public static void main(String[] args) {
        HashMap<Integer,Integer> cache = new HashMap<>();
        System.out.println(bottom_up_approach(5));
    }
}