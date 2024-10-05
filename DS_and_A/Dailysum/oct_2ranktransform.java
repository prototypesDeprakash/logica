package Dailysum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * oct_2ranktransform
 */
public class oct_2ranktransform {

    private static void ranktransform(int[]arr){ 
        Arrays.sort(arr);
          TreeMap<Integer,Integer> mymap = new TreeMap();
          ArrayList <Integer> res = new ArrayList<>();
          
        for(int i=0;i<arr.length;i++){
            if (!mymap.containsKey(arr[i])) {
                mymap.put(arr[i], i);
                
            }

        }
        for(int i=0;i<arr.length;i++){
            if(mymap.containsKey(arr[i])){   //mymap.containsKey(arr[i])
                res.add(mymap.get(arr[i]));
            }
        }

        System.out.println(mymap);
        System.out.println(res);

    }
    private static void display(int[]arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    private static void ranktransform2(int[]arr ){
        int[] orig = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        TreeMap<Integer,Integer> mymap = new TreeMap();
        
        int rank=1;
        for(int i=0;i<arr.length;i++){
            if (!mymap.containsKey(arr[i])) {
                mymap.put(arr[i], rank);
                rank++;
        }}
        int[] res = new int[orig.length];
        for (int i = 0; i < orig.length; i++) {
            res[i] = mymap.get(orig[i]);
        }  
    
    }
    private static void frank(int[]arr){
        TreeSet<Integer> mytset = new TreeSet<>();
        TreeMap<Integer,Integer> mymap = new TreeMap();
        ArrayList<Integer> res = new ArrayList<>();
      

        for(int i:arr){
            mytset.add(i);
        }
        mytset.toArray();
        int x=1;
        for(int i : mytset){
            mymap.put(i, x);
            x++;
        }
        int y =0;
        System.out.println(mymap);
        display(arr);
        
        //using entry set
    //   for( Map.Entry<Integer,Integer> enter : mymap.entrySet()) {
    
    //         if(enter.getKey() == (arr[y])){
    //             System.out.println("s");
    //             res.add(enter.getValue());
    //         }
           
    //   }

    //Using array. contains
      for(int i=0;i<arr.length;i++){
        if(mymap.containsKey(arr[i])){
            res.add(mymap.get(arr[i]));
        }
      }
      
   

        
      //  System.out.println(mymap);
      System.out.println();
      System.out.println(res);
    }
    public static void main(String[] args) {
        int[]arr={40,10,20,30};
        

        //ranktransform(arr);
      //  ranktransform2(arr);
      frank(arr);
    }
}
