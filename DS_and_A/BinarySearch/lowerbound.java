package BinarySearch;

public class lowerbound {
    private static int solution1(int[]arr,int s){

        int l =0;
        int h = arr.length-1;
        int mid=0;
        int ans=0;

        while (l<=h) {
            mid=  l+(h-l)/2;
            if(arr[mid]>=s){
                ans=mid;
                h=mid-1;    
            }
            else if(arr[mid]<s){
                l=mid+1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[]arr= {1,2,3,4,5,6,7,8,9};
        int s =1;
        System.out.println(solution1(arr, s));
    }
}
