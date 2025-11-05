package DSARestart_TCS_PRep;

import java.util.Stack;

import Dailysum.jan25.prefixcommonarray;

public class Gembreaker {

    private static void sol1(String s){
        int score =0;
        Stack mystack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(mystack.size()>0){
                if(mystack.peek().equals(c) ){
                    System.out.println(mystack.peek()+" " +c);
                    score++;
                    mystack.pop();
                }else{
                    mystack.push(c);
                }
            }else{
                mystack.push(c);
            }
        }
       // System.out.println(score);
    }
    

    public static void main(String[] args) {
        String s ="iobljndajvbqrtwovxgcnkrgklzosbncnvimojlpdgskfhpncaacfujskezjnfslmpzhacimowymsnbxdjukhaspbfklnkxobtpi";
        sol1(s);
    }
}