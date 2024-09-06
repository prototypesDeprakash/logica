package recursion_core;

public class bubblesort {
    

    
    private static void bubblesort(int[]arr,int i){
        if(arr[i-1]>arr[i]){
            int temp = arr[i];
            arr[i]= arr[i-1];
            arr[i-1]=temp;
        }
        if(i==arr.length-1)return;
        bubblesort(arr, i+1);

        
    }
    private static void bubble(int r , int c){
        if(r==0)return;
        if(c<r){
            System.out.print("*");

            bubble(r, c+1);

        }
        else{
            System.out.println();
            bubble(r-1, 0);
        }
    }

    public static void main(String[] args) {
        int[]arr = {10,23,4,22,98,1,0};
        
        // for(int i =0 ;i<arr.length;i++){
        //     bubblesort(arr, 1   ); 
        // }
        bubble(5, 0);
        

    }
}
