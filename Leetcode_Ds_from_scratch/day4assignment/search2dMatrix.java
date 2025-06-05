package Leetcode_Ds_from_scratch.day4assignment;


public class search2dMatrix {

    private static boolean matrixsearch(int[][]matrix , int target){
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target) return true;
            }
        }
        return false;
    }

    
    public static void main(String[] args) {
        int[][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(matrixsearch(arr, 9));
    }
}
