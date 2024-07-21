package leetcode_problems;
import java.util.*;
public class zoho_alternatesorting {
    public static void main(String[] args) {
        
        Integer []a = {1, 2, 3, 4, 5, 6, 7} ;
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0;
        int j=a.length-1;
        Arrays.sort(a, Collections.reverseOrder());
        while (i<=j) {
            ans.add(a[i++]);
            if (i <= j) {  // Check to avoid adding the same element twice when i == j
                ans.add(a[j--]);
            }
        }
        System.out.println(ans);

       
       
    }
}
