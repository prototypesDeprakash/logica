package Array;

public class replacewithgonright {

    public static void main(String[] args) {
        /*
         * Input: arr = [17,18,5,4,6,1]
            Output: [18,6,6,6,1,-1]
         */
        int[] arr ={400};
        int n =arr.length;

       int maxfromright = arr[n-1];
       arr[n-1]=-1;
       
       for(int i=n-2;i>=0;i--){
        int cur= arr[i];
        arr[i]=maxfromright;
        maxfromright=Math.max(maxfromright,cur);

       }
for(int j=0;j<arr.length;j++){
    System.out.print(arr[j]+" ");
}
    }
}
