package Leetcode_Ds_from_scratch.tire1_recursion;




public class reverseString {

    private static String reverse(String s){
        //when can i no longer continue(base case)
        if(s.equals("")){
            return "";
        }
        //what is the smallest amount of work that i can do in each iteration?  
        return reverse(s.substring(1))+s.charAt(0);
        //s.substring(1) -> returns all except first character
    }
    public static void main(String[] args) {
        String s ="Hello";
        System.out.println(reverse(s));
        
    }
}
