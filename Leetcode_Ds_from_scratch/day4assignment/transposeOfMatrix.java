package Leetcode_Ds_from_scratch.day4assignment;

import Skillrack.display;

public class transposeOfMatrix {
    private static int[][] matrixTranspose(int[][]arr){
        int[][] newarr = new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
               // System.out.println();
                newarr[i][j]=arr[j][i];
            }
           // System.out.println();
        }
        return newarr;
    }
    public static void main(String[] args) {
        int[][]arr={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        display.display2D(matrixTranspose(arr));

    }
}
