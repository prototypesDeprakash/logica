package leetcode_problems;
import java.util.*;
public class l_89Totalnoossubarrwhossumetok {
    public static void main(String[] args) {
        int [] nums = {1,1,1};
         
        int k=2;
        int total=0;
        Map<Integer , Integer> remainder = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            int r=total%k;
            if(!remainder.containsKey(r)){
                remainder.put(r, i);
            }
            else{
                
                
            }
            
        }
    }
}
