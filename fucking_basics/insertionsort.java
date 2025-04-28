package fucking_basics;

public class insertionsort {
    private static void insertion_sort(int[]arr){
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>temp) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    private static void ins_sort(int[]arr){
            for(int i=1;i<arr.length;i++){
            int key =arr[i];
            int j=i-1;
            while (arr[j]>key && j>=0) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
   public static void main(String[] args) {
    int[]arr = {9,1,8,2,7,3,6,5,4};
    insertion_sort(arr);
    for(int i:arr){
        System.out.println(i);
    }
   }
}

