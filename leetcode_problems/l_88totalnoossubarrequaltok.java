package leetcode_problems;

import java.util.ArrayList;

public class l_88totalnoossubarrequaltok {
    public static void main(String[] args) {
    int[] nums={1,1,1};
    int k=2;
    ArrayList<Integer> nums2 = new ArrayList<>(); 
   for(int i=1;i<nums.length;i++){
    nums2.add(nums[i]+nums[i-1]);
   }
   int count=0;
    int currentsum=0;

    for (int i=0;i<nums.length;i++){
        currentsum+=nums[i];
        if(currentsum==k){
            count+=1;
        }
        if(nums2.contains(currentsum-k)){
            count+=1;
        }
    }
    System.out.println(count);
    }
}
