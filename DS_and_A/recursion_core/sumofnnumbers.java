package recursion_core;

public class sumofnnumbers {

    public static int sumofdigits(int n){
        if(n==0) return 0;
         //if(n==1) return 1;
         return n+sumofdigits(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sumofdigits(5));
    }
}
