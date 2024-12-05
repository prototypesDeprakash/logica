package Dailysum.dailysolved.December;

public class dec4 {
    private static char findcharacter(char a){
        return (char) ('a' + ((a + 1 - 'a') % 26));
    }

    private static boolean sol1(String s1 , String s2){
        int i=0;
        int j=0;
        while (i<s1.length() && j<s2.length()) {
            if(s1.charAt(i) == s2.charAt(j) || s2.charAt(j) == findcharacter(s1.charAt(i)) ){
               // i++;
                j++;
            }
                i++;  
        }
        if(j==s2.length()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        /*
           Input: str1 = "abc", str2 = "ad"
           Output: true
           Explanation: Select index 2 in str1.
           Increment str1[2] to become 'd'. 
           Hence, str1 becomes "abd" and str2 is now a subsequence. Therefore, true is returned.
         */

         String s1 = "abd";
         String s2 = "d";
       //  System.out.println((char) ('a' + (('c' + 1 - 'a') % 26)));
       
    }
}