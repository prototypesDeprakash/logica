package DSARestart_TCS_PRep.cracking1stprogram.numberbased;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class typeingTimeCalculator {

    private static void sol1(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       Set<Character> left = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't'));
       Set<Character> right = new HashSet<>(Arrays.asList('y', 'u', 'i', 'o', 'p'));
        Stack <Character> mystack = new Stack<>();
        
        for(int i=0;i<n;i++){ //this loop is for number of testcases
            String s = sc.nextLine();
            int res=0;
            int counter=1;
            int counter2=1;

            for (char c : s.toCharArray()){
                if(left.contains(c)){   
                    if(mystack.isEmpty()){
                        mystack.add(c);
                        res+=0.2;

                    }if(!mystack.isEmpty()){
                        if(left.contains(mystack.peek())){
                            counter*=2;
                            res+= counter*0.2;
                        }
                        mystack.add(c);
                    }
                }else if(right.contains(c)){
                     if(mystack.isEmpty()){
                        mystack.add(c);
                        res+=0.1;

                    }if(!mystack.isEmpty()){
                        if(left.contains(mystack.peek())){
                            counter2*=2;
                            res+= counter2*0.1;
                        }
                        mystack.add(c);
                    }
                }

                else if(c==' '){
                    res+=0.3;
                }
            }
            System.out.println(res);
            
        }
        
    }
    public static void main(String[] args) {
        sol1();
    }
}
