public class binarysearchnormal {


    public static int binarysearch(int[] arr, int search){
        int high = arr.length-1;
        int low = 0;
        int middle = (low + high)/2;;
        while (low<high) {
            if(arr[middle]==search){
                return middle ;
            }
            if(arr[middle]<search){
                low=middle+1;
            }
            else{
                high=middle-1;
            }
        }
        return -1;


        
    }
    public static void main(String[] args) {
        int [] a  ={1,2,3,4,5,6,7,8,9};
        int res=binarysearch(a, 5);
        System.out.println("Found at position : " + res);

    }
}
