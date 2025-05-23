package Leetcode_Ds_from_scratch.array_and_string;

public class understanding {


    private static void movezeros(int[]arr){
        int l=0;
        for(int r=0;r<arr.length;r++){
            if(arr[r]!=0){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
            }
        }
        for(int x=0;x<l;x++){
            System.out.println(arr[x]);
        }
    }

    private static void removeduplicat(int[]arr){
        int l=0;
        for(int r=0;r<arr.length;r++){
            if(arr[l]!=arr[r]){
                l++;
                arr[l]=arr[r];
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,0,0,4,0,0,0,5,6};
        movezeros(arr);

    }
}
