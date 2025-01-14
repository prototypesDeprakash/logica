package Dailysum.jan25;

public class MinimumLengthofStringAfteroperation {

    private static int sol1(String s){
        int[]freqmap = new int[26];
        for(int i=0;i<s.length();i++){

            freqmap[s.charAt(i)-'a']++;
        }
        int res=0;
        for(int i=0;i<26;i++){
            if(freqmap[i]!=0 &&  freqmap[i]%2==0){
                res+=2;
            }else if(freqmap[i]!=0 &&  freqmap[i]%2!=0){
                res+=1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "abaacbcbb";
        System.out.println(sol1(s));

    }
}