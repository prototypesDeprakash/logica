package Dynamic_Programming;



public class climbingStairs {
    public static void main(String[] args) {
        int n= 5;
        int a = 1;
        int b=1;
        for(int i =0;i<n-1;i++){
            int temp=a;
            a=a+b;
            b=temp;

        }
        System.out.println(a);
    }
}
