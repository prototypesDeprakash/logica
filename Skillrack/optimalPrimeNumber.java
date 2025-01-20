package Skillrack;

public class optimalPrimeNumber {

    private static boolean sol1(int n){
       
        for(int i=2;i<=Math.sqrt(n);i++){
            if((n%i )==0){
                return false;
            }
        }
        return true;
    }

    private static boolean sieveOfEratosthenes(int max){
        boolean[] primes =  new boolean[max];
        for(int i=0;i<max;i++){
            primes[i]=true;
        }


     
    }


    public static void main(String[] args) {
        System.out.println(sol1(4));

        for(int i=2;i*i<10;i++){
            System.out.println(i);
        }
    }
}
