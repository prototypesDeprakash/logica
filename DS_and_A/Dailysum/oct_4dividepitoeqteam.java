package Dailysum;

import java.util.Arrays;

/**
 * oct_4dividepitoeqteam
 */
public class oct_4dividepitoeqteam {

    private static void solution1(int []arr){
        Arrays.sort(arr);
        int res=1;
       int prod=0;
        int i=0;
        int j = arr.length-1;
        int c=0;
        c=arr[i]+arr[j];
        prod+=arr[i]*arr[j];
        i++;
        j--;
       
    //   System.out.println(c);
        while (i<j) {
          // System.out.println("a");
            if(arr[i]+arr[j] ==c){
                res++;
                prod+=arr[i]*arr[j];
               // System.out.println("runs");
            }
            i++;
            j--;

        }
   

      // System.out.println(res);
       
        if(res==arr.length/2){
            System.out.println(prod);
        }
        else{
            System.out.println(-1);
        }
    }
    public static void main(String[] args) {
        int[]arr ={1,1,2,3};
        solution1(arr);
    }
}
