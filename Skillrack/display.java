package Skillrack;

public class display {
    public static void display2D(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " "); // Add space for better formatting
            }
            System.out.println();
        }
    }
}
