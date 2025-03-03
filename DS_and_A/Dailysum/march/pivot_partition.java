package Dailysum.march;

public class pivot_partition {
    private static void disp(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    private static int[] sol1(int[]arr , int pivot){
        int[]res = new int[arr.length];
        int x=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<pivot){
                res[x]=arr[i];
                x++;
            }

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==pivot){
                res[x++]=pivot;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>pivot){
                res[x++]=arr[i];
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int[]arr={9,12,5,10,14,3,10};
        int pivot =10;
        disp(sol1(arr, pivot));
    }
}