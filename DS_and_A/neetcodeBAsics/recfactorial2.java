package neetcodeBAsics;

public class recfactorial2 {

    private static int sol1(int n ){
        if(n==1) return 1;
        return (n*sol1(n-1));

    }
    private static int fibbo(int n){
        if(n<2){
            return 1;
        }
        return fibbo(n-1)+fibbo(n-2);
    }   

    public static void main(String[] args) {
        System.out.println(sol1(5));
        for(int i=0;i<10;i++){
            System.out.println(fibbo(i));
        }
    }
}