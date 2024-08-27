package recursion_core;

public class linearsearrchrecursion {
    static int current = 0;
    private static int  search(int[] arr , int target){
        if(arr[current] == target)return current;
        if(current > arr.length) return -1;
        current++;
        return(search(arr, target));
    }
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,5,6,7,8,9,10};
        int target = 8;
        
        System.out.println(search(arr, target));
    
    
    }
}
