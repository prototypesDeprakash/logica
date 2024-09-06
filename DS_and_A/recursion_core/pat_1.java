package recursion_core;

public class pat_1 {
    private static void statpattern(int n){
        if(n==0)return;
        for(int i=0;i<n;i++){
            System.out.print(" * ");
        }
        System.out.println();
        statpattern(n-1);
    }

    public static void main(String[] args) {
        int n=5;
        statpattern(n);
    }
}
