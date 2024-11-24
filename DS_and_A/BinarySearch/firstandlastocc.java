package BinarySearch;

public class firstandlastocc {

    private static int lowerbound(int[]arr,int search){
        int l =0;
        int h = arr.length-1;
        int mid=0;
        int ans=0;
        while (l<=h) {
            mid=(l+(h-l)/2);
            if(arr[mid]>=search){
                ans=mid;
                h=mid-1;
            }
            else if(arr[mid]<search){
                l=mid+1;
            }
        }
        return ans;

    }


    private static int upperbound(int[]arr, int search){
        int l=0;
        int h=arr.length-1;
        int ans=0;
        int mid=0;
        while (l<=h) {
            mid=l+(h-l)/2;
            if(arr[mid]>search){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,9,9,9,10};
        int search=9;
        System.out.println("First Occurance = "+lowerbound(arr, search));
        System.out.println("Last Occurance = "+upperbound(arr, search));
    }
}
