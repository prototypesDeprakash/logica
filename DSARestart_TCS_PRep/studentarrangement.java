package DSARestart_TCS_PRep;

import java.util.Arrays;
import java.util.Stack;

import Skillrack.display;

public class studentarrangement {

    private static void sol1(int[]arr1, int[]arr2){
      Arrays.sort(arr1);
      Arrays.sort(arr2);
      Stack<Integer> mystack = new Stack<>();
      boolean flag1 =true;
      boolean flag2 = true;
      for(int i=0;i<arr1.length;i++){
        mystack.add(arr1[i]);
        mystack.add(arr2[i]);
       if(i>0){
         if(mystack.get(i-1) < mystack.get(i)){
           flag1=false;
        }
       }
      }
      mystack.clear();
      //second possiblity
      for(int i=0;i<arr1.length;i++){
        mystack.add(arr2[i]);
        mystack.add(arr1[i]);
        
       if(i>0){
         if(mystack.get(i-1) < mystack.get(i)){
           flag2=false;
        }
       }
      }
      if(flag1&flag2){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
       
    }
    public static void main(String[] args) {
      int[]arr1={1,3};
      int[]arr2={2,4};
      sol1(arr1, arr2);
    }
}
