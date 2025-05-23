import java.util.Scanner;

public class Main {


    private static boolean isPrime(int n){
        if(n<=1)return false;
        if(n<=3)return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<=n;i+=6) {
            if(n%i==0 || n%(i+2) ==0)return false;
        }
        return true;
    }


    private static int specialPrime(int l , int r){
        int res=0;
        for(int i=l;i<=r;i++){
            int c =0;
            //now inner range always form 1 to n
            for(int j=i;j<i;j++){
                if(isPrime(j)){
                    c++;
                }
            }

        if(isPrime(c)){
            res++;
        }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int L=sc.nextInt();
        int R=sc.nextInt();
        System.out.println(specialPrime(L,R));
    }
}