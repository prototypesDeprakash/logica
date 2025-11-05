package DSARestart_TCS_PRep;

import java.util.Stack;

public class MinimumTimeTocolor {
     private static int sol1(String color , int[]timeTaken){
        Stack mystack = new Stack<>();
        int res =0;
        for(int i=0;i<color.length();i++){
            if(i==0){
                mystack.add(color.charAt(i));
            }
            else if(i!=0){
                 while(mystack.peek().equals(color.charAt(i))){
                int curmin = Math.min(timeTaken[i],timeTaken[i-1]);
                res+=curmin;
                mystack.add(color.charAt(i));
            }
            }
            else{
                mystack.add(color.charAt(i));
            }
           

        }
        return res;
    }

    private static void sol2(int[]arr){

        
    }
    public static void main(String[] args) {
        String colors = "aaabbbabbbb";
       int[] neededTime = {3,5,10,7,5,3,5,5,4,8,1};
       System.out.println(sol1(colors, neededTime));
    }
}
