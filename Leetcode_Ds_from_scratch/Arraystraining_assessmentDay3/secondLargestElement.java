package Leetcode_Ds_from_scratch.Arraystraining_assessmentDay3;

public class secondLargestElement {

    private static void secondLarg(int []arr){
        int firstLarg=Integer.MIN_VALUE;
        int secondLarge=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstLarg  ){
                secondLarge=firstLarg;
                firstLarg=arr[i];
                
            }else if(arr[i]>secondLarge && arr[i]!=firstLarg){
                secondLarge=arr[i];
            }
        }
        System.out.println(firstLarg);
        System.out.println(secondLarge);
    }
    public static void main(String[] args) {
        int[]arr={1,99,2,3,4,5,0};
        secondLarg(arr);
    }
}
