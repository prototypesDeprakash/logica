package Leetcode_Ds_from_scratch;

public class reversestring {
    public static void main(String[] args) {
        String s = "Prakash";
        char[] ss= s.toCharArray();
        int i=0;
        int j=s.length()-1;
        s.toCharArray();
        while (i<j) {
            char temp = ss[i];
            ss[i]=ss[j];
            ss[j]=temp;
            i++;
            j--;

        }
        ss.toString();
        System.out.println(ss);

    }
}
