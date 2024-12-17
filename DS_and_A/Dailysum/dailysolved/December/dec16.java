

public class dec16 {

    private static int min_num(int[]arr){
        int n=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            n=Math.min(n,arr[i]);
        }
        return n;
    }
    private static int findpos(int[]arr , int minval){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==minval){
                return i;
            }
        }
        return -1;
    }
    private static int[] sol1(int[]arr,int k,int multiplier){
     
        for(int i=0;i<k;i++){
            int curmin= min_num(arr);
            int curpos=findpos(arr,curmin);
            arr[curpos]*=multiplier;
        }
        return arr;
    }

    private static void disp(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,1,3,5,6}; int k = 5, multiplier = 2;
        disp(sol1(nums, k, multiplier));
    }
}