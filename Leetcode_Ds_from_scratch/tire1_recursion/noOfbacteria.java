package Leetcode_Ds_from_scratch.tire1_recursion;

public class noOfbacteria {

    private static int  BacteriaOnDayn(int n){
        if(n==0)return 1 ;
        return 2*BacteriaOnDayn(n-1);
    }
    public static void main(String[] args) {
        System.out.println(BacteriaOnDayn(5));
    }
}
