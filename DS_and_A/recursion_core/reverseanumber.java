package recursion_core;

public class reverseanumber {
   
    private static int reverseanum(int n ){
        int digits = (int)Math.log10(n)+1;
        if(n ==0) return 0 ;
        
        return (n%10 * Math.pow(10, digits-1))  +reverseanum(n/10);
    }
    public static void main(String[] args) {
        System.out.println(reverseanum(123) );
    }
}
