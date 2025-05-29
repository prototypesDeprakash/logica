package Leetcode_Ds_from_scratch.tire1_recursion;

public class sumofNnumber {

    private static int sumnumber(int n){
        if(n==0){
            return 0;
        }return(n+sumnumber(n-1));
    }
    public static void main(String[] args) {
        System.out.println(sumnumber(10));
    }
}
