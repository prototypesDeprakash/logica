package Dailysum;

import java.util.Stack;

public class oct_7minstrlenaftremsub {

    private static int solution(String s){
        //can remove ab || cd
       Stack<Character> myStack = new Stack<>();
       for(char c : s.toCharArray()){
        myStack.add(c);
        if(myStack.size()>=2 && ( 
          (  (myStack.get(myStack.size()-2 ) =='A' ) &&(myStack.get(myStack.size()-1)=='B')) ||
            (myStack.get(myStack.size()-2)=='C') &&(myStack.get(myStack.size()-1)=='D'))
            ){

            myStack.pop();
            myStack.pop();
       }
       }
       return myStack.size();

    }
    public static void main(String[] args) {
        String s = "ABFCACDB";
        System.out.println(solution(s));
    }
}

