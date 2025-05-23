package Leetcode_Ds_from_scratch;

import java.util.HashMap;
import java.util.Map;

public class may3 {


    private static int sol1(int[]top , int[] bottom){
       HashMap<Integer,Integer> mymap = new HashMap<>();
        for(int i=0;i<top.length;i++){
            if (top[i] == bottom[i]) {
                mymap.put(top[i], mymap.getOrDefault(top[i], 0) + 1);
            } else {
                mymap.put(top[i], mymap.getOrDefault(top[i], 0) + 1);
                mymap.put(bottom[i], mymap.getOrDefault(bottom[i], 0) + 1);
            }
        }

       
        
        int key_element =top[0];
        int maxcount=0;

        int minc=0;
        int c=0;

        //finding the element that is max in both the array
        for (Map.Entry<Integer,Integer> entry :mymap.entrySet()){
            if (entry.getValue()>maxcount){
                maxcount=entry.getValue();
                key_element=entry.getKey();
            }
        }
        int topRotations = 0;
        int bottomRotations = 0;
        for (int i = 0; i < top.length; i++) {
            if (top[i] != key_element && bottom[i] != key_element) {
                return -1; // Not possible
            }
            if (top[i] != key_element) topRotations++;
            if (bottom[i] != key_element) bottomRotations++;
        }

        return Math.min(topRotations, bottomRotations);

    }
    public static void main(String[] args) {
        int[]tops={2,1,2,4,2,2};
        int[]bottoms={5,2,6,2,3,2};

        System.out.println(sol1(tops, bottoms));
    }
}
