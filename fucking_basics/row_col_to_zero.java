package fucking_basics;

import java.util.ArrayList;

public class row_col_to_zero {

    private static void display(int[][]matrix){
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static void sol1(int[][]matrix){
        // ArrayList<Integer> zero_i = new ArrayList<>() ;
        // ArrayList<Integer> zero_j =new ArrayList<>();
        int zero_i=0;
        int zero_j=0;
        boolean haszero=false;
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==0){
                haszero=true;
                zero_i=i;
                zero_j=j;
            }
        }
       }

     if(haszero){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               if(i==zero_i || j==zero_j){
                matrix[i][j]=0;
               }
            }
           }
     }
    //   display(matrix);
    }
    private static void all_zeors_considered(int[][]matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        boolean[]zero_row = new boolean[row];
        boolean[]zero_col = new boolean[col];


        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    zero_row[i]=true;
                    zero_col[j]=true;
                }

               
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(zero_row[i]|| zero_col[j])
                {

                    matrix[i][j]=0;
                }
            }
        }
        display(matrix);
        
    }
    public static void main(String[] args) {
        int[][]arr = {{1,0,1},{1,1,1},{1,1,0}};
        all_zeors_considered(arr);

    }
}
