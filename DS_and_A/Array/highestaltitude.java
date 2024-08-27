package Array;

/**
 * highestaltitude
 */
public class highestaltitude {

    private static void display(int[]arr){
        for(int i =0 ;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
public static void main(String[] args) {
    int[] gain = {-5,1,5,0,-7};
    int maxi = 0;
        //need to create a prefix sum array
        int[] arr = new int[gain.length+1];
        arr[0]=0;
        for(int i=1;i<arr.length;i++){
            arr[i] = gain[i-1]+arr[i-1];
        }
        display(arr);
        for(int i =0;i<arr.length;i++){
            maxi = Math.max(maxi , arr[i]);
        }
        System.out.println("Max is"+ maxi);

}
}