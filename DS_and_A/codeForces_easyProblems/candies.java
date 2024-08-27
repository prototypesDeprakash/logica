

import java.util.Scanner;

public class candies {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int start = sc.nextInt();
        int end = sc.nextInt();
        int res=0;

        for(int i=start;i<=end;i++){
            res+=arr[i];
        }
        
        
        System.out.println(res);
    }
}
