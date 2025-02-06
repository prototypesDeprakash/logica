package Dailysum.feb;

public class maximumAscendingSubarray {

    private static void sol1(int[]arr){
        int cur=0;
        int tot=0;
      
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                cur+=arr[i];
                System.out.println(cur);
            }
            else{
                cur+=arr[i+1];
                System.out.println(cur);

                tot=Math.max(cur,tot);
                System.out.println(tot);
            }
            cur=0;
        }
        System.out.println(tot);

       }
       
       

       
    private static int sol2(int[]arr){
        int current = arr[0];
        int tot=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                current+=arr[i];
            }
            else{
                current=arr[i+1];
            }
            tot = Math.max(tot, current);

        }
       return tot;
    }

public static void main(String[] args) {
    int[]nums={10,20,30,5,10,50};
    bruit(nums);
}
}