package Dailysum.jan25;

import java.util.Stack;

public class baseballgame {

    private static int sol1(String[]s){
        Stack <Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        int res=0;
       
        for(int i=0;i<s.length;i++){
            if(s[i]=="+"){
                res+=stack.get(stack.size()-1)+stack.get(stack.size()-2);
            }if(s[i]=="D"){
                res+=stack.get(stack.size()-1)*2;

            }if(s[i]=="C"){
                res-=stack.get(stack.size()-1);
                stack.pop();
            }
            else{
                stack.add(Integer.parseInt(s[i]));
                res+=stack.get(stack.size()-1);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String[]s = {"5","2","C","D","+"};
         sol1(s);
    }
}
