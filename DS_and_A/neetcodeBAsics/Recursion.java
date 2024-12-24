package neetcodeBAsics;

public class Recursion {

    
    private static int fibbo(int n){
        if( n ==0) return 0;
        if(n==1)return 1;
        int l = fibbo(n-2);
        int r = fibbo(n-1);
        return l+r;
    }
    public static void main(String[] args) {
        System.out.println(fibbo(5));
    }
}