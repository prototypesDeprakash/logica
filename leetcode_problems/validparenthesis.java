package leetcode_problems;

import java.util.Stack;

public class validparenthesis {
    public static void main(String[] args) {
        String s= "()[]{}";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='[' ){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.isEmpty()){
                    //return false;
                    System.out.println("false");
                }
                char c = stack.peek();
                if(s.charAt(i)=='}' && c=='{'  || s.charAt(i)==')' && c=='(' || s.charAt(i)==']' && c=='[' ){
                    stack.pop();
                }
                else{
                    //return false;
                    System.out.println("false");
                }
            }
        }
        if(stack.isEmpty()){
            //return true;
            System.out.println("True");
        }else{
            //return false;
            System.out.println("False");
        }
    }
}
