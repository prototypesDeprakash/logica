package recursion_core;

public class arraylinearsearch {
    private static boolean checkelement(int [] arr, int i , int search){

        if(i==arr.length-1 )return false;
        return (arr[i]==search || checkelement(arr, i+1, search));

    }
    public static void main(String[] args){
        int[]arr = {1,2,3,4,5};
        int search=3;
        System.out.println(checkelement(arr, 0, search));
    }
}
