package Dailysum.dailysolved.December;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class contest {

    private static void sol1(){
        int[]nums = {4,5,6,4,4};
        Map<Integer, Integer> mymap = new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            mymap.put(nums[i],mymap.getOrDefault(nums[i],0)+1);
        }
        int x=0;
        for(int i=0;i<nums.length;i++){
            if(mymap.get(nums[i])>1 ){
                x=i;
            }
        }
        for(int i=x+1;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        //System.out.println(mymap);
    }
     private static boolean isUnique(int x, int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int i = x; i < arr.length; i++) {
            if (seen.contains(arr[i])) {
                return false;
            }
            seen.add(arr[i]);
        }
        return true;
    }

    private static void sol2(int[]arr){
        
    
        int operations = 0;

        for (int i = 0; i < arr.length; i += 3) {
            // If from the current index, the array is unique, stop
            if (isUnique(i, arr)) {
                System.out.println(operations);
                return;
            }
            // Increment operations as we simulate removing 3 elements
            operations++;
        }
        System.out.println(operations);
    }
    public static void main(String[] args) {
        int[]arr={4,5,6,4,4};
        sol2(arr);
      
    }
}