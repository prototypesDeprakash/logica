package Leetcode_Ds_from_scratch.DynamicProgramming;

import Skillrack.display;

public class fibbonaciSeries {

    private static int fibbonaci(int n){
        if(n ==0)return 0;
        if(n==1)return 1;
        int[]map= new int[n+1];
       map[0]=0;
       map[1]=1;
       for(int i=2;i<=n;i++){
        map[i]=map[i-1]+map[i-2];
       }
       display.display1D(map);
       return map[n];
    }
    public static void main(String[] args) {
        System.out.println(fibbonaci(20));
    }
}