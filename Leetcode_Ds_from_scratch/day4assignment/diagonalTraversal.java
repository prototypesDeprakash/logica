package Leetcode_Ds_from_scratch.day4assignment;

import Skillrack.display;

public class diagonalTraversal {
    private static int[] diagonalDisp(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int k=0,i=0,j=0;
        int[] ans = new int[m*n];
        while(k<m*n){
            while(i>=0 && j<n){
                ans[k++]=mat[i][j];
                i--; j++;
            }
            if(j==n){
                j=n-1;
                i+=2;
            }
            else if(i<0)
                i=0;

            while(i<m && j>=0){
                ans[k++]=mat[i][j];
                i++; j--;
            }
            if(i==m){
                i=m-1;
                j+=2;
            }
            else if(j<0)
                j=0;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
        display.display1D(diagonalDisp(arr));
    }
}
