package Array;

/**
 * mountainarray
 */
public class mountainarray {
    private static boolean ismountainarr(int[] arr){
        int n = arr.length;
        if(n<3)return false;
        int i=0;

        //climb
        while (i+1<n && arr[i]<arr[i+1]) {
            i++;
        }
        //if reached end

        if(i==n-1 || i==0)return false;
        
        //climb down
        while (i+1<n && arr[i]>arr[i+1]) {
            i++;
        }
        return i==n-1;
        
    }

    public static void main(String[] args) {
        int[] arr={0,3,2,1};
        System.out.println(ismountainarr(arr));
        
    }
}