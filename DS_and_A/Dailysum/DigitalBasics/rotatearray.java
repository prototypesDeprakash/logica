package Dailysum.DigitalBasics;

public class rotatearray {
    private static void display(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static int[] sol1(int[]arr,int k){
        int tmp = arr[arr.length-1];
        if(k==0){
            return arr;
          } 
        for(int i=arr.length-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=tmp;     
        return sol1(arr, k-1);
       
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7};
        int k=3;
        display(sol1(arr, k));
       

    }
}
