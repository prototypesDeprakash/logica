package BinarySearch;

public class basicbs {
    private static int solution1(int[]arr,int search){
        int low = 0;
        int high = arr.length-1;
        
        while (low<=high) {
            int mid = low+(high-low)/2;
            if(arr[mid] == search){
                return mid;
            }
            else if(arr[mid]>search){
                high=mid-1;

            }
            else{
                low=mid+1;
            }
           
        }
        return -1;
    }
public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9};
    int search = 1;
    System.out.println(solution1(arr, search));
}
}
