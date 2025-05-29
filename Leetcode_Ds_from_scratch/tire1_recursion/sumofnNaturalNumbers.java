package Leetcode_Ds_from_scratch.tire1_recursion;

public class sumofnNaturalNumbers {

    private static int sumofn(int n){
        if(n==0)return 0;
        return n+sumofn(n-1);
    }

    private static int sumwithvar(int n , int sum){
        if(n==0)return sum;
        return sumwithvar(n-1, sum+n);
    }
    public static void main(String[] args) {
        System.out.println(sumofn(10));
        System.out.println(sumwithvar(10, 0));
        
    }
}
