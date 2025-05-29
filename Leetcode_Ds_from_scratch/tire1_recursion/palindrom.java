package Leetcode_Ds_from_scratch.tire1_recursion;

public class palindrom {
    private static boolean isPall(String s){

        //what is the base case?
        if(s.length()==0 || s.length()==1){
            return true;
        }

        //what is the minimum step i can do ?
        if(s.charAt(0)==s.charAt(s.length()-1)){
            return isPall(s.substring(1,s.length()-1));
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPall("Hellow"));
    }
}
