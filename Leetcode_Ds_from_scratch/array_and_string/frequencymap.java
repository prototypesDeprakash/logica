package Leetcode_Ds_from_scratch.array_and_string;

import Skillrack.display;

public class frequencymap {
    public static void main(String[] args) {
        String s ="ABCADDE";
        int[]arr=new int[26];
        for (char ch : s.toCharArray()) {
            arr[ch-'A']++;
        }
        for(int i=0;i<26;i++){
            System.out.println((char)('A'+i) +"= "+arr[i]);
        }

    }
}
