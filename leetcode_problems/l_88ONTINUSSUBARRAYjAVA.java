
package leetcode_problems;
/**
 * l_88CONTINUSSUBARRAYjAVA
 */
import java.util.*;
public class l_88ONTINUSSUBARRAYjAVA {
public static void main(String[] args) {
    int[] nums={23,2,4,6,7};
    int k=6;
    Map<Integer,Integer> remainder = new HashMap();
    remainder.put(0, -1);
    int total =0;

    for (int i=0;i<nums.length;i++){
        total+=nums[i];
        int r=total%k;
        if(!remainder.containsKey(r)){
            remainder.put(r,i);
        }
        else{
            if(i-remainder.get(r)>1){
                System.out.println("True");
                return;
            }

        }


    }
    System.out.println("False");
}
    
}