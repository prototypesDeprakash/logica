package Leetcode_Ds_from_scratch.array_and_string;

public class checkifarrayissorted {

    private static boolean isSorted(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        if(isSorted(arr)){
            System.out.println("yes array is sorted");
        }else{
            System.out.println("array is not sorted");
        }
    }
}
