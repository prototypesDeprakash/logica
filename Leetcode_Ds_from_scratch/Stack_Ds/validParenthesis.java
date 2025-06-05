package Leetcode_Ds_from_scratch.Stack_Ds;

import java.util.Stack;

public class validParenthesis {
    private static boolean valisBracket(String s){
        Stack<Character> mystack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='[' || s.charAt(i)=='(' || s.charAt(i)=='{'){
                mystack.add(s.charAt(i));
            }
            else if(s.charAt(i)==']'){
                if(!mystack.isEmpty() && mystack.peek()=='['){
                    mystack.pop();
                }
                else{
                    mystack.add(']');
                }
            }
            else if(s.charAt(i)==')'){
                if(!mystack.isEmpty() && mystack.peek()=='('){
                    mystack.pop();
                }
                else{
                    mystack.add(')');
                }
            }
            else if(s.charAt(i)=='}'){
                if(!mystack.isEmpty()&& mystack.peek()=='{'){
                    mystack.pop();
                }
                else{
                    mystack.add('}');
                }
            }
        }
        return mystack.isEmpty();

    }
    public static void main(String[] args) {
        String s = "()[]{}";
       System.out.println(valisBracket(s));
    }
}
