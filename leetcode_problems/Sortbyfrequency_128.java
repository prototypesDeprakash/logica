import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/**
 * Sortbyfrequency_128
 */
public class Sortbyfrequency_128 {

    int count(int[]arr,int i){
        int coun =0;
        for(int y =0;y<arr.length;y++){
            if(arr[y]==i){
                coun++;
            }
        }
        
        return coun;
    }


    public static void main(String[] args) {
      
        int[] arr ={1,2,3,4,5,1,1,1,1,1};
        HashMap <Integer,Integer> hashmap = new HashMap<>();
        Sortbyfrequency_128 sf= new Sortbyfrequency_128();
       // int s=sf.count(arr, 1);
       for(int i =0 ; i<arr.length;i++){
        int s  = sf.count(arr, arr[i]);
        hashmap.put(arr[i],s);
       }
       ArrayList<Integer> a = new ArrayList<>();
       for(int i : hashmap.keySet()){
        a.add(i);
       }

       System.out.println(a);
       
       System.out.println(hashmap);
        
    }
}