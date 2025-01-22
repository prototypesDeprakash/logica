package Skillrack;

import java.util.ArrayList;
import java.util.Scanner;

public class dailychallenge21 {

    private static void display(char[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void sol1(){
        //getting input
        ArrayList<String> myinp = new ArrayList<>();
        Scanner sc = new Scanner( System.in);
        while (true) {
            String s = sc.nextLine();
            if (s.isEmpty()) { // Stop on an empty line
                break;
            } else {
                myinp.add(s);
            }
        }
        //making it as a matrix
        char[][]arr = new char[myinp.size()][myinp.get(0).length()];
        for(int i = 0;i<myinp.size();i++){
            for(int j= 0;j<myinp.get(0).length();j++){
                arr[i][j]=myinp.get(i).charAt(j);
                //System.out.println(myinp.get(i).charAt(j));
            }
        }
      // System.out.println(myinp);
        //display(arr);

        int rows = arr.length;
        int cols = arr[0].length;

        StringBuilder res = new StringBuilder();
        for (int col = 0; col < cols; col++) {
            if (col % 2 == 0) { // For even-indexed columns (0, 2, 4...)
                // Print top to bottom
                for (int row = 0; row < rows; row++) {
                    if(arr[row][col]!='-'){
                        res.append(arr[row][col]);
                    }
                   // System.out.print(arr[row][col] + " ");
                }
            } else { // For odd-indexed columns (1, 3...)
                // Print bottom to top
                for (int row = rows - 1; row >= 0; row--) {
                    if(arr[row][col]!='-'){
                        res.append(arr[row][col]);
                    }
                   
                }
            }
        }
        System.out.println(res);
        //printing in the pattern with matrix 
    }


    private static void finalsol(){
    
      
        
          
            ArrayList<String> myinp = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            while(true){

                try{
                String s = sc.nextLine();

                if(s.isEmpty()){
                    break;
                }else{
                    myinp.add(s);
                }}catch(Exception e){
                    break;
                }
            }
            char[][] arr = new char[myinp.size()][myinp.get(0).length()];
            for(int i=0;i<myinp.size();i++){
                for(int j=0;j<myinp.get(0).length();j++){
                    arr[i][j]=myinp.get(i).charAt(j);
                }
            }
            int rows = myinp.size();
            int cols = myinp.get(0).length();
            
            StringBuilder res = new StringBuilder();
            for(int col =0;col<cols;col++){
               if(col%2==0){
                   for(int row=0;row<rows;row++){
                       if(arr[row][col]!='-'){
                           res.append(arr[row][col]);
                       }
                   }
               }
               else{
                   for( int row=rows-1;row>=0;row--){
                       if(arr[row][col]!='-'){
                           res.append(arr[row][col]);
                       }
                   }
               }
            }
            System.out.print(res.toString());
        
        
            
        }
    

    public static void main(String[] args) {
      sol1();
        int[][]arr = {{1,2,3},
                      {4,5,6},
                      {7,8,9}};
                            

    }
}
