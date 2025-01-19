package neetcodeBAsics;

public class insertionsort {
    private static void display(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    private static int[] insert(int[]arr){
        for(int j=0;j<arr.length;j++){
            for(int i=1;i<arr.length;i++){
                if(arr[i]<arr[i-1]){
                    int temp = arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[]arr = {99,32,994,1,45,4,3,2};
        
        display(insert(arr));
    }
}
