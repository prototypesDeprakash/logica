package Dailysum.jan25;

import java.util.Stack;

public class asteroidcollision {

    private static int[] sol1(int[]arr){
        Stack<Integer> mystack = new Stack<>();

       
       for(int i=0;i<arr.length;i++){
        int current = arr[i];

        while (!mystack.isEmpty() &&current<0 &&mystack.peek()>0) {
            if(Math.abs(current)>mystack.peek()){
                mystack.pop();
            }
            else if(Math.abs(current)<=mystack.peek()){
                mystack.pop();
                current=0;
                break;
            }
            
        }

        if(current!=0){
            mystack.add(current);
        }
        
       }
       int[]res=new int[mystack.size()];
       int i =0;
       for(int s:mystack){
        arr[i]=s;
        i++;
       }
     return res;
    }

    public static void main(String[] args) {
        int[]arr={10,2,-5};
        System.out.println(sol1(arr));
    }
}