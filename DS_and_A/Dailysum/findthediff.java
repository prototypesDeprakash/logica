package Dailysum;

import java.util.ArrayList;

public class findthediff {

    public static void main(String[] args) {
        String s = "abcd";  
        String t = "abcde";
        ArrayList<Character> mys = new ArrayList<>();

        for(char c : s.toCharArray()){
            mys.add(c);
        }
        for(int i=0;i<t.length();i++){
            if(!mys.contains(t.charAt(i))){
                return t.charAt(i);
            }
        }
    }
}