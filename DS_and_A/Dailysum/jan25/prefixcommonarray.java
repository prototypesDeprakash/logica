package Dailysum.jan25;

public class prefixcommonarray {

    private static void printer(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    private static int findcommon(int x , int[]arr1, int[]arr2 ){
        int c=0;
        for(int i=0;i<=x;i++){
            for(int j=0;j<=x;j++){
                if(arr1[i]==arr2[j]){
                    c++;
                }
            }
        }
        return c;
    }

    private static void sol1(int[]arr1, int[]arr2){
        int[]res = new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            res[i]=findcommon(i, arr1, arr2);
        }
       // printer(res);
    }
    public static void main(String[] args) {
        int[]arr1 = {2,3,1};
        int[]arr2 = {3,1,2};
        sol1(arr1, arr2);
        
    }
}
