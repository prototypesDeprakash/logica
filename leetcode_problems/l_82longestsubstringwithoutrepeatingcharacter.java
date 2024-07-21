package leetcode_problems;
import java.util.*;
public class l_82longestsubstringwithoutrepeatingcharacter {
    public static void main(String[] args) {
    String s = "abcbcabb";
   // s.toCharArray();
     int l =0 ;
     int count=0;
     Set<Character> myset = new HashSet<>();
     for(int r=0;r<s.length();r++){
        while (myset.contains(s.charAt(r))) {
            myset.remove(s.charAt(l));
            l++;
        }
        myset.add(s.charAt(r));
        count=Math.max(count,r-l+1);
   

     }
    System.out.println(count);

    }
}
