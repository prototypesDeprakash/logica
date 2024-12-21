package Dailysum.dailysolved.December;
public class dec7 {
    private static int maxarr(int[]arr){
        int maxx=0;
        for(int i=0;i<arr.length;i++){
            maxx=Math.max(arr[i],maxx);
        }
        return maxx;
    }

    private static boolean canassign(int[]arr , int maxop,int maxvalue_mid){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxvalue_mid){
                count+=(int)Math.ceil((double)(arr[i]-maxvalue_mid/maxvalue_mid));
            }
        }
        return count<=maxop;
    }

    private static int sol1(int [] arr, int maxop){
        int low=1;
        int high = maxarr(arr);
        int res= Integer.MAX_VALUE;
        while (low<=high) {
        int mid = (low+(high-low)/2);
            if(canassign(arr, mid, maxop)){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }

        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}


/*
 *  private static int maxarr(int[] arr) {
        int maxx = 0;
        for (int i = 0; i < arr.length; i++) {
            maxx = Math.max(arr[i], maxx);
        }
        return maxx;
    }

    // Check if we can distribute the array such that no value exceeds maxvalue_mid
    private static boolean canassign(int[] arr, int maxOp, int maxvalue_mid) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxvalue_mid) {
                count += (int) Math.ceil((double) (arr[i] - maxvalue_mid) / maxvalue_mid);
            }
        }
        return count <= maxOp;
    }

    // Binary search to find the minimum largest value
    private static int sol1(int[] arr, int maxOp) {
        int low = 1;
        int high = maxarr(arr);
        int res = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoid overflow in (low + high)
            if (canassign(arr, maxOp, mid)) {
                res = mid; // Update the result with the smaller maxvalue_mid
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

 */