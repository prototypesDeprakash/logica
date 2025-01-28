package neetcodeBAsics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import BasicMath.countdigits;
import Skillrack.matrixproblems25;
import neetcodeBAsics.display;

public class longestconsecutivesequence {

    private static int sol1(int[]arr){
        int longest=0;
        TreeSet<Integer> myset = new TreeSet<>();
        for(int n:arr){
            myset.add(n);
        }

        for(int i=0;i<arr.length;i++){
          
                int length =0;
                while (myset.contains(arr[i]+length)) {
                    length++;
                }
                longest=Math.max(longest, length);

            
        }
        return longest;
    }

    private static int sol12(int[]arr){
        Set<Integer> myset = new HashSet<>();
        //populate the set
        for(int n:arr){
            myset.add(n);
        }
        int longest =0;

        for(int num : myset){
            int length = 0;
            if(!myset.contains(num-1)){
                while (myset.contains(num+length)) {
                    length++;
                }
            }
            longest=Math.max(length, longest);
        }
        return longest;
    }
    public static void main(String[] args) {
        int[]arr={0,0,1,1,1,2,4,3,3,3,-1,-1};
        sol1(arr);

    }
}