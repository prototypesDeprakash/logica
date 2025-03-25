package zoho_patterns;

public class countdigits {


    private static void sol1(int n){
        int temp=0;
        int orig=n;
        int c=0;
        while (n!=0) {
            temp=n;
            temp=temp%10;
            n=n/10;

            if(temp!=0){
                if(orig%temp==0){
                    c++;
                }
            }
          
           // System.out.println(temp);
        }
        System.out.println(c);
    }
    public static void main(String[] args) {
        sol1(20);
    }
}