package BasicPattern.twopoinandslidwinfow;

import java.util.HashSet;

/**
 * LongestSubstringWithoutRepeatingCharacters
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        //Input: s = "abcabcbb"
        String s = "abcabcbb";
        //aabbac
        int l =0;
        int r =0;
        int maxsum=0;
        HashSet<Character> myset = new HashSet<>();
       for(r=0;r<s.length();r++){
        while (myset.contains(s.charAt(r))) {
            myset.remove(s.charAt(l));
            l++;
        }
        myset.add(s.charAt(r));
        maxsum=Math.max(maxsum, r-l+1);
       }
       System.out.println(maxsum);
       System.out.println(myset);
       System.out.println(myset);
    }
}