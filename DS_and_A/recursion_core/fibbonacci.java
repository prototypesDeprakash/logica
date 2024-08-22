package recursion_core;

public class fibbonacci {

    private static int fibbo(int n){
        if(n==0 || n==1){
            return 1;
        }
        return fibbo(n-1)+fibbo(n-2);
    }
    public static void main(String[] args) {
        int num=100;
       for(int i=0;i<num;i++){
        System.out.println( fibbo(i));
       }
    }
}
