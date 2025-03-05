package Dailysum.march;

public class checkpowersofthree {

    private static boolean sol1(int n){
        int i=0;
        while ((int)Math.pow(3, i+1)<=n) {
            i++;
        }

        while (i>=0) {
            int power = (int)Math.pow(3, i);
            if(power<=n){
                n-=power;
            }
            i-=1;

        }
        return n==0;
    }
    public static void main(String[] args) {
        
    }
}