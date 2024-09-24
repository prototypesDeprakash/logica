public class TrailingZeros {
    private static int factorial(int n){
        int res=1;
        for(int i=1;i<=n;i++){
            res=res*i;
        }
        return res;
    }
    public static void main(String[] args) {
        int n =factorial(25);
        int c=0;
        while (n%10 ==0) {
            c++;
            n=n/10;
        }
        System.out.println(c);
    }
}
