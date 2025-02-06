package neetcodeBAsics;

import java.util.HashSet;

public class longestsubstringwithoutrepeatingcharacters {

    private static int sol1(String s){
        int l=0;
     
        int maxlength=0;
     
        HashSet<Character> myset = new HashSet<>();
       for(int r=0;r<s.length();r++){
        while (myset.contains(s.charAt(r))) {
            myset.remove(s.charAt(r));
            l++;
        }
        myset.add(s.charAt(r));
        maxlength=Math.max(maxlength, r-l+1);

       }
        return maxlength;
    }
    public static void main(String[] args) {

        String s ="abcabcbb";
        sol1(s);
    }
}
