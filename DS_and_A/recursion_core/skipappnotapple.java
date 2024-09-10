package recursion_core;

public class skipappnotapple {
    private static String skip(String rem){
        if(rem.isEmpty()){
            return "";
        }
        if(rem.startsWith("app") && !rem.startsWith("apple") ){
            return skip(rem.substring(3));
        }
        else{
            return rem.charAt(0)+skip(rem.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(skip("pieapppie"));
    }
}
