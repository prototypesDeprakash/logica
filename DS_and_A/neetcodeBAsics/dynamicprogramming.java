package neetcodeBAsics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class dynamicprogramming {

    private static int bruitforce(int n){
        if(n <=1){
            return n;
        }else{
            return bruitforce(n-1)+bruitforce(n-2);
        }
    }
    private static int bottomup(int n){
        int f =0;
        int s =1;
        int i=2;
        if(n<2){
            return n;
        }
        while (i<=n) {
            int tem = s;
            s =f+s;
            f=tem;
            i++;

        }
        return s;
    }

    private static int memoization(int n , HashMap<Integer,Integer> cache){
        if(n<=1){
            return n ;
        }
        if(cache.containsKey(n)){
            return cache.get(n);
        }
        int res = memoization(n-1, cache)+memoization(n-2, cache);
        cache.put(n, res);
        return res;
        
        
    }
    public static void main(String[] args) {
        HashMap<Integer , Integer> mymap = new HashMap<>();
        System.out.println(bruitforce(6));
        System.out.println(memoization(6, mymap));
        HashSet<Integer> myset = new HashSet<>();
        System.out.println(bottomup(6));
    }
}
