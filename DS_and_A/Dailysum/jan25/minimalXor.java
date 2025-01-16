package Dailysum.jan25;

public class minimalXor {



    private static int setbitcouter(int n){
        int setbit=0;
        while (n!=0) {
            n=n&(n-1);
            setbit++;

        }
        return setbit;
    }
    public static void main(String[] args) {
        int num=100;
        int sc=Integer.bitCount(num); 
        System.out.println(sc);
        System.out.println(setbitcouter(num));
    }
}