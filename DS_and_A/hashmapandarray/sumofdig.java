package hashmapandarray;

public class sumofdig {

    public static void main(String[] args) {
        int n =156;
        int c =n;
        int sum =0;
        while (n>0) {
            int temp = n%10;
            sum+=temp;
            n=n/10;
        }
        System.out.println(sum);
        System.out.println(c/sum);
    }
}