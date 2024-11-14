package Dailysum;

public class mov11 {

    //helper function

    private static boolean issorted(int[]arr){
        for(int i =0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[i]>=arr[i+1]){
                    return false;
                }
            }
        }
        return true;
    }
    private static boolean solution1(int[] arr){
        if(issorted(arr)){
            return true;
        }
        else{
            for(int i=0;i<arr.length;i++){
                arr[i] -= arr[i]- i+1;
                if(issorted(arr)){
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr={5,8,3};
        System.out.println(solution1(arr));
    }
}
