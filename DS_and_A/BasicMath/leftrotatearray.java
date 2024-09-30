package BasicMath;

public class leftrotatearray {

    private static void bruitforcesolution(int[]arr){
        int f=arr[0];
        int end = arr.length-1;
        int i=1;

       
        
        while (i<=end) {
            arr[i-1]=arr[i];
            i++;

        }
        arr[end]=f;

        
    }
    private static void display(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        bruitforcesolution(arr);
        display(arr);
    }
}
