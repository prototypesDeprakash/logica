package neetcodeBAsics;

import java.util.Arrays;

import neetcodeBAsics.display;

public class longestconsecutivesequence {

    private static void sol1(int[]arr){
        Arrays.sort(arr);
        display.display1d(arr);
        
    
    }
    public static void main(String[] args) {
        int[]arr={0,-1};
        sol1(arr);

    }
}