package neetcodeBAsics;

import java.util.HashMap;

public class twosum1 {

    private static int[] sol1(int[]arr,int target){
        HashMap<Integer,Integer>mymap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement = target-arr[i];

            if(mymap.containsKey(complement)){
                return new int[]{mymap.get(complement),i};
            }
            mymap.put(arr[i], i);
            
        }
        return new int[]{};
    }


    private static int[] sol2(int[]arr,int target){
        HashMap<Integer,Integer>mymap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement = target-arr[i];
            if(mymap.containsKey(complement)){
                return new int[]{mymap.get(complement),i};
            }
            mymap.put(complement, i);

        }
        return new int[]{};

    }
    public static void main(String[] args) {
        
    }
}
