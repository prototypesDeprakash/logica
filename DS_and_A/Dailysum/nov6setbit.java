package Dailysum;

public class nov6setbit {
    private static void display(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
private static int setbitcount(int n){
        int count =0;
        while (n>0) {
            n&=(n-1);
            count++;
        }
        return count;
    }

    private static boolean solution1(int[]arr){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]<=arr[j+1]){
                    continue;
                }else{
                    if(setbitcount(arr[j]) == setbitcount(arr[j+1])){
                        temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        //display(arr);
        return true;
    }
    public static void main(String[] args) {
        int[] arr ={3,16,8,4,2};
        solution1(arr);
    }
}