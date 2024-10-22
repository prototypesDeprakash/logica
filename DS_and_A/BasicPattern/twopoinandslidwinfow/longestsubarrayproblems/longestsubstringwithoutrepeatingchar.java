package BasicPattern.twopoinandslidwinfow.longestsubarrayproblems;

import java.util.HashSet;

import recursion_core.mergesortrecall1;

public class longestsubstringwithoutrepeatingchar {



private static int solution1(String s){
    HashSet<Character> myHashSet = new HashSet<>();
    int l=0;
    int r =0;
    int maxsize=0;
    for(r=0;r<s.length();r++){
        while (myHashSet.contains(s.charAt(r))) {
            myHashSet.remove(s.charAt(l));
            l++;
        }
        myHashSet.add(s.charAt(r));
        maxsize=Math.max(maxsize, r-l+1);

    }
    return maxsize;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        //[a b b d e]
    //l =  0
    //R =  0 1 2 3 4
    //char={   , b,d,e}
    //r = 4 - l = 1 = 3
        System.out.println(solution1(s)); 
    }
}
