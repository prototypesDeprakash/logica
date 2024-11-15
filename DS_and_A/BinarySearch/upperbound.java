package BinarySearch;

public class upperbound {
    private static int solution1(int []arr, int s){
        int l=0;
        int h=arr.length-1;
        int ans=0;
        int mid = 0;

        while (l<=h) {
            mid = l+(h-l)/2;
            if(arr[mid]>s){
                ans = arr[mid];
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }


        return ans;
    }
    
    public static void main(String[] args) {
        int[]arr  = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(solution1(arr,4 ));
    }
}
