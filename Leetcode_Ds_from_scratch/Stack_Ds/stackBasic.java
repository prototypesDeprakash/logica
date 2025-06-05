package Leetcode_Ds_from_scratch.Stack_Ds;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.IOException; // Don't forget to import IOException

public class stackBasic {
    private static void myStack(){

    }
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
        int c = Integer.parseInt(reader.readLine());
        int age = Integer.parseInt(reader.readLine()); 
        System.out.println(c+age);
            
        }catch(Exception e ){
            System.out.println(e);
        }
       
         
    }
}
