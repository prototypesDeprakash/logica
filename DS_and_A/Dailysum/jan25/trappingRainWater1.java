package Dailysum.jan25;

public class trappingRainWater1 {

    private static void display(int[]arr){
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    private static int sol1(int[]arr){
        int[]maxleft = new int[arr.length];
        int[]maxright = new int[arr.length];
        int[]minarr = new int[arr.length];
        maxright[arr.length-1]=arr[arr.length-1];
        maxleft[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            maxleft[i]=Math.max(arr[i],maxleft[i-1]);
        }
        for(int i=arr.length-2;i>=0;i--){
            maxright[i]=Math.max(arr[i], maxright[i+1]);
        }

      //  display(maxleft);
       // display(maxright);

        for(int i=0;i<arr.length;i++){
            minarr[i]=Math.min(maxleft[i], maxright[i]);
        }
        int res=0;
        for(int i =0;i<arr.length;i++){
            if((minarr[i]-arr[i] )>0){
                res+=minarr[i]-arr[i];
            }
        }
       return res;
    }
    public static void main(String[] args) {
        int[]arr={0,1,0,2,1,0,1,3,2,1,2,1};
        sol1(arr);
    }
}