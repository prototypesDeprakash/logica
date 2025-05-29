package Leetcode_Ds_from_scratch.tire1_recursion;

public class factorialOfnumber {

    private static int factorial(int n){
        if (n==0){
            return 1;
        }return (n*factorial(n-1));
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
