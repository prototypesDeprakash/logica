package recursion_core;

public class arraysortedoptimal {
    private static boolean check(int arr[] , int i){
        if(arr[i]==arr.length-1)return true;
        return ( arr[i]<arr[i+1] && check(arr, i+1));
                                      // yepudi irunthalum , check will reach true so

                // even if this is false
                // false and true = false
                // if its true
                //true and true  = true


    }
    
    public static void main(String[] args) {

        int[]arr={1,2,3,9,5};
        System.out.println(check(arr, 0));
        
    }
}
