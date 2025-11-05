package DSARestart_TCS_PRep;

import java.util.Stack;

public class removeAdjacent {

    private static void sol1(String s ){
        Stack<Character> mystack = new Stack<Character>();
        String res ="";
        mystack.add(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(mystack.isEmpty()){
                mystack.add(s.charAt(i));
            }
           else if(mystack.peek().equals(s.charAt(i))){
                mystack.pop();
            }else{
                mystack.add(s.charAt(i));
            }
        }
        if(mystack.isEmpty()){
            System.out.println("Empty String");
        }else{
            for(Character c : mystack){
                res+=c;
            }
            System.out.println(res);
        }


    }
    public static void main(String[] args) {
        sol1("aaabccddd");
    }
}
