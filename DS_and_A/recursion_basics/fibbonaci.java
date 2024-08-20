public class fibbonaci {
    public static int fibbo(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibbo(n-1)+fibbo(n-2);
    }
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println(fibbo(i));
        }
    }
}
