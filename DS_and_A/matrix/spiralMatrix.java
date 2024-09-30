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
         *  5  6   7   81
         *  9  10  11  12
         */


         //first iteration 

         int left = 0;
         int right= arr[0].length-1;
         int top=0;
         int bottom = arr.length-1;
         int dir=0;
         while (top<=bottom && left<=right) {
            
         
         //System.out.println(right);
         if(dir==0){
         for(int i=left;i<=right;i++){
            System.out.print(arr[top][i]+" ");
         }
         top++;

        }
         //from right top to bottom
        
         if(dir==1){
         for(int i=top;i<=bottom;i++){
            System.out.print(arr[i][right]+" ");
         }
         right--;

        }
         // form right to left\
       
         if(dir==2){
         for(int i=right;i>=left;i--){
            System.out.print(arr[bottom][i]+" ");
         }
        bottom--;
         
        }
        //bottom to top
        if(dir==3){ 
        for(int i=bottom;i>=top;i--){
            System.out.print(arr[i][left]+" ");
        }
        left++;

    }
    dir=(dir+1)%4;

    }



    }
}
