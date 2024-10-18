package Dailysum.dailysolved;

import java.util.Stack;

/**
 * removeclosestnonstarcharacter
 */
public class removeclosestnonstarcharacter {
    private static String solution1(String s ){
        Stack <Character> mystack = new Stack<>();
        
      for(char c : s.toCharArray()){
        mystack.add(c);
        if(c=='*'){
            mystack.pop();
            mystack.pop();
        }
        
      }
        String res="";
        for (char c : mystack){
            res+=c;
        }
        return res;
        
    }

    public static void main(String[] args) {
        solution1("hell***");
    }
}