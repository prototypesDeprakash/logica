package Dailysum;

import java.util.ArrayList;
import java.util.HashMap;

public class removeduplicatesdromsortedarr2 {
    private static void solution1(int[] nums){
        HashMap<Integer,Integer> mymap = new HashMap<>();
        for(int num:nums){
            mymap.put(num, mymap.getOrDefault(num, 0)+1);
        }
        System.out.println(mymap);
          ArrayList<Integer> result = new ArrayList<>();

        // Step 2: Apply conditions and add numbers to result list dynamically
        for (Integer key : mymap.keySet()) {
            int count = mymap.get(key);

            // Apply the conditions
            if (count == 1) {
                result.add(key);
            } else if (count > 2) {
                result.add(key);
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,1,2,3,3};
        solution1(nums);
    }
}
