package Leetcode_Ds_from_scratch.tire1_recursion;

public class understandingrecursion {

    private static void printNumber(int n){
        if(n==0){
            n+=1;
        }
        if(n==11){
            return ;
        }
        System.out.println(n);
        printNumber(n+=1);
    }
    public static void main(String[] args) {
        printNumber(0);
    }
}
