public class Trailingzerosalgo {
    public static void main(String[] args) {
        //algorithm for trailing zeros 

        // the concept is  if we count the number of 5 in a factorial , that is the nuber of trailing zeros
        // so there is a series to calculat that
        // n /5 + n/25 + n/125 + n /625 + ......

        int n =25;
        int powof=5;
        int res=0;
        while (powof<=n) {
            res+=(n/powof);
            powof=powof*5;
        }
        System.out.println(res);
    }
}



