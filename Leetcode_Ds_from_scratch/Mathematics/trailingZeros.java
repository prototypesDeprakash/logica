package Leetcode_Ds_from_scratch.Mathematics;

import Skillrack.optimalPrimeNumber;

public class trailingZeros {

    private static int Optimal_Solution(int n ){
        int zeros=0;
        for(int i=5;i<=n;i=i*5){
            zeros+=n/i;
        }
        return zeros;
    }

    private static int trailingZeros(int n) {
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
                                   
        }
        int zeros=0;
        while (fact%10==0) {
            zeros++;
            fact=fact/10;
        }
        return zeros;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(trailingZeros(n));
        System.out.println(Optimal_Solution(1000));
    }
}
