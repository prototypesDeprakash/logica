package recursion_core;

public class reversestring {

    private static String reverse (String r){
        if(r.isEmpty()) return r;

        return reverse(r.substring(1)) +r.charAt(0);


    }

    public static void main(String[] args) {
        String r ="abcdefghijklmnoplmn";
       System.out.println( reverse(r));
    }
    
}
