package Skillrack;

public class display {
    public static void display2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " "); // Add space for better formatting
            }
            System.out.println();
        }
    }
    public static void display1D(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
