package recursion_core;

public class fibbonaciwithrecursion {
    private static int fibbo(int n){
        if(n==0) return 0;
        if(n==1 || n==2)return 1;
        return fibbo(n-1)+fibbo(n-2);
    }

    public static void main(String[] args) {
        for(int i =0;i<10;i++){
            System.out.print(fibbo(i)+" ");
        }
    }
}
