package recursion_core;

public class stringpalindrom {
    private static boolean pallindrom(String word){
        if(word.length()==0 || word.length()==1) return true;
        if(word.charAt(0)==word.charAt(word.length()-1)) return pallindrom(word.substring(1, word.length()-1));
        
        return false;
        
    }
    public static void main(String[] args) {
        System.out.println(pallindrom("bibiibib"));
    }
1
