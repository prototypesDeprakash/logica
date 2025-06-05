package Skillrack;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

import Skillrack.display;
public class matrixproblems25 {

    private static void display(String[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j].isEmpty()){
                    System.out.print("-");
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static void checkWholes(String[][]arr){
        LinkedList<Integer> wholesList = new LinkedList();
        for(int i=0;i<arr[0].length;i++){
            int c=0;
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j][i]+" ");
                if(arr[j][i].equals("*")){
                    c++;
                }
            }
            wholesList.add(c);
            System.out.println();
        }
        System.out.println(wholesList);
    }
    private static void sol1(){
        Scanner sc = new Scanner(System.in);
        int row =sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine();
        String[][] arr =new String[row][col];
        System.out.println();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
              //  System.out.print('*'+" ");
              String s=sc.nextLine();
              arr[i][j]=s;
            }
        }
        //System.out.println(arr);
        //display(arr);
        checkWholes(arr);
    }
    public static void main(String[] args) {
        sol1();

    }
}
