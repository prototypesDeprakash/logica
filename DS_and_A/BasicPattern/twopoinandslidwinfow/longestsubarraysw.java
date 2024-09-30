package BasicPattern.twopoinandslidwinfow;

import java.util.HashMap;
import java.util.HashSet;

public class longestsubarraysw {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=9;
        HashSet<Integer> s = new HashSet();
        
        
        int l=0;
        int r=0;
        int sum=0;
        int maxsum=0;
        int maxlen=0;
        while (r<arr.length) {
            sum+=arr[r];
            

            while (sum>k) {
                sum-=arr[l];
                l++;
            }
            if (sum<=k) {
                maxsum=Math.max(sum, maxsum);
                maxlen=Math.max(maxlen, r-l+1);

            }
            r++;
        }
        System.out.println(maxsum);
        System.out.println(maxlen);


    }
}
