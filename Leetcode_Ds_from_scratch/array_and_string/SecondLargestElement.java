package Leetcode_Ds_from_scratch.array_and_string;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[]arr = {1,233,2,3,4,5,6,7,8,9,10,232,233};
        int firstlarg=arr[0];
        int secondlarg=0;
        for(int i=0;i<arr.length;i++){
        if(arr[i]>firstlarg){
            secondlarg=firstlarg;
            firstlarg=arr[i];
        }else if(arr[i]>secondlarg && arr[i]!=firstlarg){
            secondlarg=arr[i];
        }

        }
        System.out.println(secondlarg);
    }
}
