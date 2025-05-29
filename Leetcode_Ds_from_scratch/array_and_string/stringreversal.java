package Leetcode_Ds_from_scratch.array_and_string;

public class stringreversal {

    private static void reverseString(String s){
        char[]ss = s.toCharArray();
        int l=0;
        int r = s.length()-1;
        while (l<r) {
         char c = ss[l];
         ss[l]=ss[r];
         ss[r]=c;
         l++;
        r--;
        }
        
            
        System.out.println(new String(ss));
    }
    public static void main(String[] args) {
        String s ="hello";
        reverseString(s);
    }
}
