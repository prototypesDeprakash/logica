public class plaindromrecursion {

    private static boolean rec(String a ){
        if(a.length()==0 || a.length()==1){
            return true;
        }
        if(a.charAt(0) == a.charAt(a.length()-1)){
            return rec(a.substring(1,a.length()-1));
        }
        return false;
    }
    public static void main(String[] args) {
        String a = "Payak";
        System.out.println(rec(a));

    }
}
