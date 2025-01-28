package neetcodeBAsics;

public class validPalindrom {

    private static boolean sol1(String s){
       
       int start =0;
       int end =s.length()-1;
       while (start<end) {
        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        start++;
        end--;

       }
       return true;

    }
    public static void main(String[] args) {
       System.out.println(sol1("helloolleh"));

       System.out.println("he l l o ".replace(" ", ""));
    }
}
