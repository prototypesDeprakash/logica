package Dailysum;

public class nov18_short_subarr_with_sum_k {

    private static int[] sort(int[]arr){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    private static int sol1(int[]arr,int k){
        int siz=0;
        int sum=0;
      
    }
    private static void disp(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[]arr={2,-1,2};
        int k=3;
      //  System.out.println(sol1(arr, k));
      //disp(sort(arr));

       

    }
}
