package fucking_basics;

public class gcd {

    private static int gcdprogram(int a , int b){
        if (b==0){
            return a;

        }
        else{
            return (gcdprogram(b, a%b));
        }
    }
    public static void main(String[] args) {
      System.out.println(gcdprogram(4, 6));
    }
}
