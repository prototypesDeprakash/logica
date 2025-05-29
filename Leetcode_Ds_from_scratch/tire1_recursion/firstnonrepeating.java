package Leetcode_Ds_from_scratch.tire1_recursion;

import java.util.HashMap;
import java.util.HashSet;

public class firstnonrepeating {

    private static void firstNonele(int[]arr){
        HashSet<Integer>myset = new HashSet<>();
        for(int n:arr){
            if(myset.contains(n)){
                myset.remove(n);
            }else{
                myset.add(n);
            }
            
        }
        for(int i=0;i<arr.length;i++){
            if(myset.contains(arr[i])){
              //  return arr[i];
            }
        }
        System.out.println(myset);
        //return 0;
    }

    private static int fix(int[]arr){
        HashMap<Integer,Integer>mymap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mymap.put(arr[i], mymap.getOrDefault(arr[i], 0)+1);
        }
        for(int n :arr){
            if(mymap.get(n)==1){
                return n;
            }
        }
        return -1;
    }
    private static int first_element_twince(int[]arr){
        HashMap<Integer, Integer> mymap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mymap.put(arr[i], mymap.getOrDefault(arr[i], 0)+1);

        }
        for(int n:arr){
            if(mymap.get(n)==2){
                return n;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr = {2, 3, 2, 3, 2, 4};
      //  System.out.println(firstNonele(arr));
      firstNonele(arr);

    }
}
