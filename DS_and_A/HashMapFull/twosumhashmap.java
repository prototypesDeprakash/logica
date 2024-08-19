package HashMapFull;

import java.util.HashMap;

public class twosumhashmap {
    public static void main(String[] args) {
        /*

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

         */
        int[] nums = {2,7,11,15};
        int target= 9;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            
            if(map.containsKey(target-num)){
                System.out.println(num+" "+(target-num));
            }
            else{
                map.put(num, target-num);
            }
            
        }
    }
}
