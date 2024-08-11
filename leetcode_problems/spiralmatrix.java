/**
 * spiralmatrix
 */
public class spiralmatrix {

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        for(int i=0;i<3;i++){
            for (int j =0 ;j<3;j++){
                arr[i][j]=i+j+3;
            }
        }
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("ans: ");

//implementing the spiral metrox
        //printing the top row
        int top = 0;
        int bottom = arr.length-1;
        int l =0;
        int r = arr[0].length-1;

       while (top<=bottom && l<=r) {
         //PRINTING THE TOP ROW 
         for(int i=l;i<=r;i++){
            System.out.print(arr[top][i]+" ");
        }
        top++;
        //PRINTING FROM TOP TO BOTTOM ON THE RIGHT SIDE
        for(int i =top;i<=bottom;i++){
            System.out.print(arr[i][r]+" ");
        }
        r--;
        if(top<=bottom){
        for(int i = r ;i>=l;i--){
            System.out.print(arr[bottom][i]+" ");
        }

        bottom--;
    }
    if(l<=r){
        for(int i=bottom;i>=top;i--){
            System.out.print(arr[i][l]+" ");
        }
        l++;        
       }
    }
    }
   
}