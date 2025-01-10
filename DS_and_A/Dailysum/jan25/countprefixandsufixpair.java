package Dailysum.jan25;

import java.security.cert.TrustAnchor;


public class countprefixandsufixpair {

    private static boolean isPrefixAndSuffix(String s1, String s2){
       
        int siz = s1.length();
        if (s2.length() < siz) {
            return false;
        }
        if(!s1.equals(s2)){
        if((s2.substring(0,siz).equals(s1)) && (s2.substring(s2.length()-siz).equals(s1)) ){
            return true;
        }
    }
        return false;
    }
    private static int sol1(String[] words){
        int c=0;
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
               if (isPrefixAndSuffix(words[i], words[j])) {
                    c++;
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
      String[]  words = {"a","aba","ababa","aa"};
      System.out.println(sol1(words));
       
    }
}