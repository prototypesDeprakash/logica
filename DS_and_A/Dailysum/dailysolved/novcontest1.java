
public class novcontest1 {

    private static boolean solution1(String s){
        //char[] nums =s.toCharArray();
        long x = Long.parseLong(s);  // Use long here to handle larger values
        long temp = 0;
        long even = 0;
        long odd = 0;
        int i = 0;
        while (x!=0) {
            temp=x;
            temp=temp%10;
            i++;
            if(i%2!=0){
                odd+=temp;
            }else{
            even+=temp;
            }
            x=x/10;

        }
       if(even==odd){
        return true;
       }
       return false;

    }

    private static boolean solution2(String s){
        int odd=0;
        int even=0;
        char[] nums = s.toCharArray();
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
            if(i%2==0){
                even+=nums[i]-'0';
            }
            else{
                odd+=nums[i]-'0';
            }
        }
        if(even==odd){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "7123816724";
      //  solution1(s);
      System.out.println(solution2(s));

    }
}