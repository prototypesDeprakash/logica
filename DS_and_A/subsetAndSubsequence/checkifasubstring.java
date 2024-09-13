package subsetAndSubsequence;

public class checkifasubstring {
    private static int substr(String p , String up,String t){
        if(p.equals(t)){
            //System.out.println("True");
            return 1;
        }
        if(up.isEmpty()){
          //  System.out.println("False");
            return 0;
        }
      
        char ch = up.charAt(0);
       int exclude= substr(p, up.substring(1) ,t);
       int include= substr(p+ch, up.substring(1),t);
       
        return exclude == 1 || include == 1 ? 1 : 0;
    }
    public static void main(String[] args) {
        String t="ahbgdc";
       System.out.println(substr("", "ahbgdc",t));
    }
}
