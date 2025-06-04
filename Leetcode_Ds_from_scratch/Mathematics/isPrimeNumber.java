package Leetcode_Ds_from_scratch.Mathematics;

public class isPrimeNumber {
    private static boolean isPrime(int n){
        if(n==1) return false;
        for(int i=2;i<n;i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }
    private static boolean isPrimeBetter(int n){
        for(int i=2;i*i<n;i++){
            if(n==1)return false;
           if(n%i==0){
            return false;
           }
        }
        return true;
    }
    private static boolean isprimeMuchBetter(int n ){
        if(n==1)return false;
        if(n==2 || n==3 )return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<n;i+=6){
            if(n%i==0 || n%i+2==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       System.out.println( isPrime(53));
       isPrimeBetter(17);
    }
}
