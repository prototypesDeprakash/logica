package Leetcode_Ds_from_scratch.tire1_recursion;

public class printDigitOfaNumber {

    private static int PrintDigit(int n){
        if(n==0) return 0;
        return (n%10)+PrintDigit(n/10);
        
    }
    public static void main(String[] args) {
        PrintDigit(112);
    }
}
