package Dailysum;

import java.util.Stack;

/**
 * oct_8stackimbalancecount
 */
public class oct_8stackimbalancecount {
// COUNT Approach: Using counting to track imbalance (optimal solution)

    private static int optimal(String s){
        int closing=0;
        int maxclosing=0;
        for(char c : s.toCharArray()){
            if(c=='['){
                closing--;
            }
            else{
                closing++;
            }
            maxclosing=Math.max(maxclosing, closing);
        }
        return (maxclosing+1)/2;
    }
    private static int solution(String s){
        int invalidcount=0;
        Stack<Character>mystack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='['){
                mystack.push(c);
         
            }
            if(!mystack.isEmpty()&&c==']'){
                mystack.pop();
               
            }
            else if(mystack.isEmpty()&&c==']'){
                invalidcount++;
            }
        }
        return (invalidcount);

    }

    public static void main(String[] args) {
        String s = "[]";
        System.out.println(solution(s));
       System.out.println(optimal(s));

    }
}