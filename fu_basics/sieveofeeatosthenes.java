package fu_basics;

public class sieveofeeatosthenes {


    private static void optimalPrime(int n){
        boolean[]prime = new boolean[n+1];
        for(int i=2;i<=n;i++){
            if(!prime[i]){
                for(int j=i*2;j<=n;j+=i){
                    prime[j]=true;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(!prime[i]){
                System.out.println(i);
            }
        }
    }

    private static void veryOptimal(int n){
        boolean[]prime = new boolean[n+1];
        for(int i=2;i<=Math.sqrt(n);i++){ // or i*i <n this is = to i<root(n)
            if(!prime[i]){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=true;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(!prime[i]){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        //optimalPrime(50);
        veryOptimal(50);
    }
}