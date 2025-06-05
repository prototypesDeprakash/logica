package Skillrack;

import java.util.Scanner;

public class DigitSum {

    private static void sol(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(sumofdigit(arr[i])+",");
        }
    }

    private static int sumofdigit(int n){
        int s =0;
        while (n!=0) {
            int temp = n%10;
            s+=temp;
            n=n/10;
        }
        return s;
    }

    public static void main(String[] args) {
        
        System.out.println(sumofdigit(10));
        int[]arr = {11,44,34,445,111,244};
        sol(arr);
    }
}