package Dailysum;

public class nov1 {
    private static String solution1(String s){
        StringBuilder res = new StringBuilder();
        int c=0;
        res.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                c++;
            }
            else{
                c=1;
            }
            if(c<=2){
                res.append(s.charAt(i));
            }
    
        }
        return res.toString();
        
        
    }
    public static void main(String[] args) {
        String s = "leeetcode";

        System.out.println(solution1(s));
    }
}
