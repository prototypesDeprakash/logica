package recursion_core;

public class reversinganumberrecur {
static int temp=0;
    private static int sumofn(int n){
      
        if (n==0)return temp;
        temp=temp*10 + n%10;
        return  sumofn(n/10  );

    }
    public static void main(String[] args) {
        System.out.println(sumofn(123));
    }
}
