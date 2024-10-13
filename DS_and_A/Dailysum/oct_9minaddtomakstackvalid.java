package Dailysum;

import java.util.Stack;

public class oct_9minaddtomakstackvalid {
    private static int solution1(String s){
       Stack <Character> mystack = new Stack<>();
       int required=0;
        for(char c : s.toCharArray()){
            if(c=='('){
                mystack.add(c);
            }
            else if(!mystack.isEmpty() && c==')'){
                mystack.pop();
            }
            else if(mystack.isEmpty() && c==')'){
                required++;
            }
        }
       
        return required+mystack.size();
    }

    private static int solution2(String s){
        int opening=0;
        int closing=0;
        for(char c : s.toCharArray()){
            if(c=='('){
                opening++;
            }
            else if(c==')'){
                if(opening>0){
                    opening--;
                }
                else{
                    closing++;
                }
            }
       
        }
        int r =(opening+closing);
        return r;
    }
    public static void main(String[] args) {
        String s ="()";
       
        System.out.println(solution2(s));
    }
}
