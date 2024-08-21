package recursion_core;



public class hellorecursion {
    

    public static void sayhello(int n){
        if(n==0)return;
        sayhello(n-1);
        System.out.println("Hello Bro "+n);
        
    }
    public static void sayhello2(int n){
        if(n==5)return;
        System.out.println("Hello bro"+n);
        sayhello2(n+1);
    }

    public static void main(String[] args) {
        sayhello(5);
        System.out.println();
        //sayhello2(0);
    }
}
