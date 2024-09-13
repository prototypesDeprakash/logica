package Array;

public class Max_consecutive_ones {
    public static void main(String[] args) {
        /* Input: nums = [1,1,0,1,1,1]
            Output: 3*/

        int[]nums = {1,0,1,1,0,1};
        int p =0 ;
        int i=0;
        int  res=0;
    
        while (p!=nums.length) {

            
            if(nums[p]==0){
                i=0;
            }else{
                i++;
            }
            res=Math.max(i, res);

            p++;
            
        }
        System.out.println(res);
    }
}
