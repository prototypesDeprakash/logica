package Dailysum.jan25;

public class wordsasprefix {

    private static int sol1(String[]s,String prefix){
        int c=prefix.length();
        int x=0;
        for(int i=0;i<s.length;i++){
            if (s[i].substring(0,c).equals(prefix)) {
                x++;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        
    }
}