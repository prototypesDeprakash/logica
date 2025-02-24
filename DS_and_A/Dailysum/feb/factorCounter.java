package Dailysum.feb;

public class factorCounter {
    private static int factor_counter(int n){
        int c =0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        return c;
    }

    private static void display(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    private static void sol1(int[]arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=factor_counter(arr[i]);
        }
        display(arr);
    }

    public static void main(String[] args) {
        int[]arr={8,15,25,36,42};
       // System.out.println(factor_counter(36));
       sol1(arr);

    }
}