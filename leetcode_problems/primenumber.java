package leetcode_problems;

/**
 * primenumber
 */
public class primenumber {
    public boolean isprime(int n){
        boolean isprime=true;
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       
    }
}