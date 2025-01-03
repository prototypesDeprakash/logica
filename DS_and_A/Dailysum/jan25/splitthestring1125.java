package Dailysum.jan25;

import java.rmi.MarshalException;

import Dailysum.dailysolved.prefixsumbasic;

public class splitthestring1125 {


    private static int[] pefixsum(String s){
        int[]arr = new int[s.length()];
        int sum=0;
        int i=0;
        for(char c : s.toCharArray()){

            if(c=='1'){
                sum++;
                arr[i]=sum;

            } else{
                arr[i]=sum;
            }
            i++;  
        }
        return arr;

    }
    private static void display(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    private static int sol1(String s , int[] arr){
       int zeros=0;
       int ones=0;
       for(char c : s.toCharArray()){
        if(c=='1'){
            ones++;
        }
       }
int maxx= Integer.MIN_VALUE;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='0'){
            zeros++;
        }else{
            ones--;
        }
        maxx= Math.max(zeros+ones,maxx);

       }
       return maxx;

    }
    public static void main(String[] args) {
        String s ="011101";
        //display(pefixsum(s));
        sol1(s, pefixsum(s));

    }
}