package Array;



public class duplicatezeros {
    private static int countzero(int[]a){
        int zeros=0;
        for (int i : a) {
            if(i==0){
                zeros++;
            }
        }
        return zeros;
    }
    private static void display(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] a = {1,0,2,3,0,4,5,0};
        int z = countzero(a);
        
    
       for(int i=a.length-1 , j=a.length+z-1 ;i>=0;i--,j--){
         if(j<a.length){
            a[j]=a[i];
         }
         if(a[i]==0){
            j--;
            if(j<a.length){
                a[j]=0;
            }
         }
       }
      
       display(a);
    }
}
