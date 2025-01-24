package neetcodeBAsics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sortcolor {

    private static void display(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    private static int[] sol1(int[]arr){
        Map<Integer,Integer> mymap = new HashMap<>();
        int[]res = new int[arr.length];
        List<Integer>[] freq = new List[arr.length+1];
        for(int i=0;i<freq.length;i++){
            freq[i]=new ArrayList<>();
        }
        for(int n : arr){
            mymap.put(n, mymap.getOrDefault(n, 0)+1);
        }
       // System.out.println(res.length);
       int index=0;
        for(Map.Entry<Integer,Integer> entry : mymap.entrySet()){
            int current_key = entry.getKey();
            int current_value= entry.getValue();
            System.out.println(current_key+" "+current_value);
            
            for(int i=0;i<current_value;i++){
                res[index++]=current_key;
                System.out.println(current_key);
            }
        }
        System.out.println(mymap);
        return res;

    }
    public static void main(String[] args) {
        int[]arr={0,1,2};
        display(sol1(arr));
    }
}
