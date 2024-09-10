package subsetAndSubsequence;




public class rem_a_p {
    private static void skip (String p , String up ){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch =='a'){
            skip(p, up.substring(1));
        }
        else{
            System.out.println(p);
            skip(p+ch, up.substring(1));
            
        }
    }

    public static void main(String[] args) {
        skip("", "holaabolald");
    }
}
