package Leetcode_Ds_from_scratch.tire1_recursion;

public class fibbo {

    private static int fibbonaci(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        return fibbonaci(n-1)+fibbonaci(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibbonaci(6));
    }
}
