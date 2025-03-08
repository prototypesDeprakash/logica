package Dailysum.DigitalBasics;

public class rotatearray {
    private static void display(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //Recursive Solution
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

    private static int[] simpleSolution(int[]arr,int k){
        int[]res_arr= new int[arr.length];
       
        for(int i=0;i<arr.length;i++){
            res_arr[(i+k)%arr.length]=arr[i];
        
    }
        return res_arr ;
    }

    private static void reverseArray(int[] arr , int start , int end) {
        int left = start, right =end;
        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }
    private static int[] reverseMethod(int[]arr , int k){

        k=k%arr.length-1;
        reverseArray(arr, 0, arr.length-1);
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, arr.length-1);
        return arr;
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7};
        int k=3;
       // display(sol1(arr, k));  
       // System.out.println("Second method");
        //simpleSolution(arr, k);
        reverseMethod(arr, k);
       

    }
}
