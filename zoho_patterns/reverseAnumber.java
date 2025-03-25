package zoho_patterns;

public class reverseAnumber {

    private static int sol1(int n){
        int temp=0;
        int rev=1;
        while (n!=0) {
            temp=n%10;
            rev=rev*10+temp;
            n=n/10;
        }
        return rev;
    }
   public static void main(String[] args) {
    
   } 
}
