public class spiralmatrix2 {
    public static void main(String[] args) {
        int[][]arr= {{1,2,3},{8,9,4},{7,6,5}};

        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int l=0;
        int r = arr[0].length-1;
        int top = 0;
        int bottom=arr.length-1;
System.out.println("Solution is : ");

// here comes a while loop
while (l<=r && top<=bottom) {
    

        for(int i=0;i<=r;i++){
            System.out.print(arr[top][i] +" ");
        }
        top++;
        for(int i=top;i<=bottom;i++){
            System.out.print(arr[i][r]+" ");
        }
        r--;
        for(int i =r;i>=l;i--){
            System.out.print(arr[bottom][i]+" ");
        }
        bottom--;
        for(int i=bottom;i>=top;i--){
            System.out.print(arr[i][l]);
        }
        l++;

    }
        
        
    }
}
