package Dailysum.march;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class maximumuniquesubarray {

    private static int sol1(int[]arr){
        HashSet<Integer> mySet = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!mySet.contains(arr[i])){
                mySet.add(arr[i]);
            }
        }
       // System.out.println(mySet);
       List<Integer> list = new ArrayList<>(mySet);
        int max=Integer.MIN_VALUE;
      
        for(int i=0;i<list.size();i++){
           int sum=0;
            for(int j=i;j<list.size();j++){
                sum+=list.get(j);
            }
            System.out.println(sum);
            max=Math.max(max, sum);

        }
        
      return max;
       
    }
    public static void main(String[] args) {
        int[]arr ={-1, -2, -3, -4};
        System.out.println(sol1(arr));
        System.out.println("hello");
    }
}