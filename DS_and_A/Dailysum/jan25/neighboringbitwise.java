package Dailysum.jan25;

public class neighboringbitwise {
    private static boolean sol1(int[]nums){
        int res=0;
        for(int n :nums){
            res^=n;
        }
        return res==0;
    }
    public static void main(String[] args) {
        
    }
}
