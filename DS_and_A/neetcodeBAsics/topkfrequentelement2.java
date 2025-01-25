package neetcodeBAsics;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class topkfrequentelement2 {

    private static void display(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    private static int[] sol1(int[]arr,int k){

        HashMap<Integer,Integer> mymap = new HashMap<>();
        List<Integer>[]freq = new List[arr.length+1]; 

        for(int i=0;i<freq.length;i++){
            freq[i]=new ArrayList<>();
        }
        for(int n: arr){
            mymap.put(n, mymap.getOrDefault(n, 0)+1);
        }
       for(Map.Entry<Integer,Integer>entry:mymap.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }
        int[]res = new int[k];
        int index=0;
        for(int i =freq.length-1;i>0 && index<k;i--){
            for(int n:freq[i]){
                res[index]=n;
                index++;
                if(index==k){
                    return res;
                }
            }
        }
        return res;
        

    }
    public static void main(String[] args) {
        int[]arr = {1,2,2,3,3,3};
        display(sol1(arr, 2));
    }
}
