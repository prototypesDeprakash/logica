package Dailysum.jan25;

import java.util.Scanner;

public class skillrack {
    private static void inp(){
        String t ="65@23 120@234";
        String[]a= t.split(" ");
        String[]b=a[0].split("@");
        String[]c=a[1].split("@");       
         System.out.println(b[0]);
         System.out.println(c[0]);

    }
    private static void onlyalpha(String s){
        String res="";
        char[]arr = new char[26];
        for(int i=0;i<s.length();i++){
            arr[(s.charAt(i)-97)]=s.charAt(i);
        }
        for(int i=25;i>=0;i--){
            if(arr[i]!=0){
                res+=arr[i];
            }
        }
    
        System.out.println(res);
       

 

    }
    public static void main(String[] args) {
        onlyalpha("cake");
        

    }
}
