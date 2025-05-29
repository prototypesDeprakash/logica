package Leetcode_Ds_from_scratch.array_and_string;

public class asciishit {
    public static void main(String[] args) {
        String s = "JAMES";
        int tot=0;
        int i=1;
        for(char ch :s.toCharArray()){
            tot+=((int)ch)*i;
            i++;
        }
        System.out.println(tot);
    }
}
