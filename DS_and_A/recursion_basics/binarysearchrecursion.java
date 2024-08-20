public class binarysearchrecursion {

    public static int BinarySearchRecursion(int[] arr ,  int left , int right , int search){

        if(left > right){ //base condition 
            return -1;
        }
        int middle =(left+right)/2;
        if(arr[middle]==search){
            return middle;
        }
        if(arr[middle]>search){
            return BinarySearchRecursion(arr, left, middle-1, search);
        }
        return BinarySearchRecursion(arr, middle+1, right, search);
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        int search = 5;
        int low =0;
        int high = arr.length;

        int result = BinarySearchRecursion(arr, low, high, search);
        System.out.println(result);
    }
}
