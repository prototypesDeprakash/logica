package matrix;

public class spiralMatrix {
    public static void main(String[] args) {
        int[][]arr ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        // output = [1,2,3,4,8,12,11,10,9,5,6,7]
        
        /*  
            a11 a12 a13
            a21 a22 a23 
            a31 a32 a33

            1  2   3   4
         *  5  6   7   8
         *  9  10  11  12
         */


         //first iteration 

         int left = 0;
         int right= arr[0].length;
         int top=0;
         int bottom = arr.length;
         //System.out.println(right);
         for(int i=left;i<right;i++){
            System.out.print(arr[top][i]+" ");
         }
         //from right top to bottom
         top++;
        
         for(int i=top;i<bottom;i++){
            System.out.print(arr[i][bottom]+" ");
         }
         right--;
         // form right to left
         


    }
}
