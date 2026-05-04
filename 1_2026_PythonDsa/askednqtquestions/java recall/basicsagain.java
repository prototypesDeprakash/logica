import java.util.Scanner;

class basicsagain{

 public static void printarr(int[]arr){
        for (int i : arr){
            System.out.print(i);
        }
    }
    public static void main(String[]args){

   

        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        printarr(arr);
        
    }
}