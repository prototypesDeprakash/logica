package HashMapFull;

import java.util.HashSet;

public class happynumber {
    private static int splitandsquare(int n){
        int res=0;
        while (n!=0) {
            
            res+=Math.pow(n%10,2) ;
            n/=10;
        }

        return res;
    }
    public static void main(String[] args) {
        int n = 20;
        HashSet<Integer> seen = new HashSet<>();


        while (n!=1 && !seen.contains(n)) {
            seen.add(n);
            n=splitandsquare(n);
       }
       if(n==1){
        System.out.println("Happy number");
       }
       else{
        System.out.println("not a happy numebr");
       }


    }
}
