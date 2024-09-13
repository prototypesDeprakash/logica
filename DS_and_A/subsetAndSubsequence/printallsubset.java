package subsetAndSubsequence;

public class printallsubset {
    private static void printsubset(String p , String up){
        if(up.isEmpty()){
            System.out.print(p+" - ");
            return;
        }

        char ch = up.charAt(0);
        printsubset(p+ch, up.substring(1));
        printsubset(p, up.substring(1));
    }

    public static void main(String[] args) {
     printsubset("", "ahbgdc");   
    }
}
