package Dailysum.dailysolved;

public class prefixsumbasic {
    private static void display(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void prefixsum(int[]arr){
        int []prefix = new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        display(prefix);
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        prefixsum(arr);
    }
}
