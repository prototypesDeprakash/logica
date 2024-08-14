package HashMapFull;
import java.util.*;
public class twosum {
   public static void main(String[] args) {
    int[] nums = {2,7,11,15};
    int target = 9;
    HashMap<Integer,Integer> a  = new HashMap<>(); 
    for(int i =0;i<nums.length;i++){
        if(a.containsKey(target-nums[i])){
            System.out.println("num1 = " + nums[i] + " num2 = "+ (target-nums[i]));
            
        }
        else{
            a.put(nums[i], target-nums[i]);
        }
    }
   }
}
