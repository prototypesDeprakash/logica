package javaoops.wordCounter;

import java.util.ArrayList;

public class Solution {

    public static int CountWords(String str){
        int c=0;
        String[] wordList = str.split(" ");

        for(String s : wordList){
            c++;

        }
        return c;
        }
    public static void main(String[]args){
       // System.out.println(CountWords("Fuck you bitch jh jhkb hk"));
       int c=5;
       System.out.println(c++);
       System.out.println(c);
    }
}
