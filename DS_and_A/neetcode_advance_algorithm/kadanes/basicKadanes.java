package neetcode_advance_algorithm.kadanes;

public class basicKadanes {
    private static int bruitforce(int[]arr){
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currentsum=0;
            for(int j=i;j<arr.length;j++){
                currentsum+=arr[j];
                maxsum=Math.max(maxsum, currentsum);

            }
        }
        return maxsum;
    }
    private static int kadanes(int[]arr){
        
        int maxsum=Integer.MIN_VALUE;
        int cursum=0;
        for(int i=0;i<arr.length;i++){
           cursum=Math.max(cursum, 0);
           cursum+=arr[i];
           maxsum=Math.max(maxsum, cursum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[]arr={-3,-2,-3};
        System.out.println(bruitforce(arr));
        System.out.println(kadanes(arr));
    }
}
