package codeForces_easyProblems;

import java.util.Scanner;

/**
 * reverseanarray
 */
public class reverseanarray {
    private static void didplay(int[] arr){
        for(int i =0 ; i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j = arr.length-1;
        int temp=0;
        while (i<j) {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        didplay(arr);

        
    }
}