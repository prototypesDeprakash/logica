package neetcodeBAsics;

public class twosum2 {

    private static int[] sol1(int[]arr,int target){
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] ==target){
                    return new int[]{i,j};
                }
            }
            
        }
        return new int[]{};
    }
    

    public static void main(String[] args) {
        //input array is sorted
        //space complexity = O(1);
        //Input: numbers = [1,2,3,4], target = 3
        int[]arr={1,2,3,4};
        int targer =5;

    }
}