package leetcode_problems;

public class merge_104_ {
    

    private static void mergeSort(int[] arr) {
       int length = arr.length;
       if(length<=1) return ; // base case 
       int middle = length/2;
       int [] leftarray = new int[middle];
       int [] rightarray = new int[length-middle];
       int i=0;//left array
       int j=0;//right array
       for (;i<length;i++){
        if(i<middle){
            leftarray[i]=arr[i];
        }
        else{
            rightarray[j]=arr[i];
            j++;
        }
       }
       mergeSort(leftarray);
       mergeSort(rightarray);
       merge(leftarray, rightarray, arr);
    }

    //helper method 
    private static void merge(int[] leftarray ,int[]rightarray, int[]array){
        int leftSize = array.length/2;
        int rightSize=array.length-leftSize;
        int i =0; //array
        int l =0 ; //left array
        int r =0; //right array
        while (l<leftSize && r<rightSize) {

            if(leftarray[l]<rightarray[r]){
                array[i]=leftarray[l];
                i++;
                l++;
               
            }
            else{
                array[i]=rightarray[r];
                i++;
                r++;
            }
            
        }
        while (l<leftSize) {
            array[i]=leftarray[l];
            i++;
            l++;
        }
        while (r<rightSize) {
            array[i]=rightarray[r];
            i++;
            r++;
        }
        
    }

    public static void main(String[] args) {
        int[]arr = {4,77,86,3,1,9,34};
        mergeSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
