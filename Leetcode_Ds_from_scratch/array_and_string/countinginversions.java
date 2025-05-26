package Leetcode_Ds_from_scratch.array_and_string;

public class countinginversions {

    private static int sol1(int[]arr){
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    c++;
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        
    }
}