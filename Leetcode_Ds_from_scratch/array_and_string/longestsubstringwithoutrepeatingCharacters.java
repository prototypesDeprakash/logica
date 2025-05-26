package Leetcode_Ds_from_scratch.array_and_string;

import java.util.HashSet;

public class longestsubstringwithoutrepeatingCharacters {

    private static int lss(String s){
        
        int l=0;
        int maxlength=0;
        HashSet<Character> myset = new HashSet<>();
        for(int r=0;r<s.length();r++){
            while (myset.contains(s.charAt(r))) {
                myset.remove(s.charAt(l));
                l++;
            }
            myset.add(s.charAt(r));
            maxlength=Math.max(maxlength, r-l+1);
        }
        return maxlength;

    }
    public static void main(String[] args) {
        String s ="pwwkew";
    }
}