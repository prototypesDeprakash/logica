package recursion_core;

/**
 * linearsearch
 */
public class linearsearch {

    private static int search(int []arr , int i, int target){
        if(i==arr.length-1) return -1;
        if(arr[i]==target)return i;
        return(search(arr, i+1, target));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 2;
        System.out.println(search(arr, 0, target));
    }
    
}