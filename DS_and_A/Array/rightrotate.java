package Array;
import Array.arraydisplay;

public class rightrotate {
    
    private static void reverse(int start , int end , int[]arr){
        int l=start;
        int r=end;
        while (l<r) {
            int temp = arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
    public static void arr_display(int []arr){
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        int rotateby = 2;
        int[]arr = {1,2,3,4,5};
        reverse(0, arr.length-1, arr);
        reverse(0,rotateby-1, arr);
        reverse(rotateby, arr.length-1, arr);
        arr_display(arr);
        
      
        
    }
}
