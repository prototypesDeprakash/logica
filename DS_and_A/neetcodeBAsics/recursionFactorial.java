package neetcodeBAsics;



public class recursionFactorial {

    private static int factorial(int n){
       if(n<=1){
        return 1;    
       }
       return n*factorial(n-1);      
    }

    private static int rec(int n){
        if(n==0){
            return 0;
        }return rec(n-1)+rec(n-2);
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(factorial(n));
    }
    
}