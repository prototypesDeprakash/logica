package Dailysum.dailysolved.December;

public class dec18 {
    private static int[] sol1(int[]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j] && j>i){
                    arr[i]-=arr[j];
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        
    }
}