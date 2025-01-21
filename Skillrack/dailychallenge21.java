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
            if(s!=""){
                myinp.add(s);
            }
            else{
                break;
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
        display(arr);
        //printing in the pattern with matrix 
    }
    public static void main(String[] args) {
        sol1();
    }
}
