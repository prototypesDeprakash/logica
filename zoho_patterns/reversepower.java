package zoho_patterns;

public class reversepower {
    private static int rev(int n){
        int temp=0;
        int rev=0;
        while (n!=0) {
            temp=n;
            rev=rev*10 + temp%10;
            n=n/10;
        }
        return rev;
    }
    private static int sol1(int n ){
           return (int) Math.pow(n, rev(n));
    }
    public static void main(String[] args) {
       System.out.println(rev(2));
        System.out.println(sol1(2));
    }
}
