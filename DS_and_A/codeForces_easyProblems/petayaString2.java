//package codeForces_easyProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class petayaString2 {
    private static StringBuilder remove_vovel(String str  ){
        StringBuilder a  = new StringBuilder();
       
        ArrayList<Character> vovels = new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U','y','Y')); 

        for(int i=0;i<str.length();i++){    
            if(!vovels.contains(str.charAt(i))){
                a.append(str.charAt(i));
            }
        }
        return a;
    }
    private static StringBuilder add_dot(String str){
        StringBuilder a = new StringBuilder();
        for(int i=0;i<str.length();i++){
            a.append(".");
            a.append(str.charAt(i));
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();

        System.out.println(add_dot(remove_vovel(s1).toString()).toString().toLowerCase() );
    
       
    }
    
}
